val `root-path` = file(".").getCanonicalFile

val `module-path` = `root-path` / "modules"

val `test-path` = `module-path` / "test"
val `main-path` = `module-path` / "main"

val `adt-path`         = `main-path` / "simple-adt"
val `adt-codegen-path` = `adt-path` / "codegen"
val `adt-core-path`    = `adt-path` / "core"

val `injection-path`      = `main-path` / "simple-injection"
val `injection-core-path` = `injection-path` / "core"

val `test-common-path` = `test-path` / "test-common"

scalaVersion := scalaV.v213
name         := "simple-nat"

lazy val testProjects = project in `test-path`
lazy val mainProjects = project in `main-path`

lazy val adt = project in `adt-path`

lazy val `adt-codegen` = project in `adt-codegen-path`
lazy val `adt-core`    = crossProject(JSPlatform, JVMPlatform) in `adt-core-path` dependsOn (`test-common` % Test)

lazy val `adt-coreJVM` = `adt-core`.jvm
lazy val `adt-coreJS`  = `adt-core`.js

lazy val injection        = project in `injection-path`
lazy val `injection-core` = crossProject(JSPlatform, JVMPlatform) in `injection-core-path` dependsOn (`test-common` % Test)

lazy val `injection-coreJVM` = `injection-core`.jvm
lazy val `injection-coreJS`  = `injection-core`.js

lazy val `test-common` = crossProject(JSPlatform, JVMPlatform) in `test-common-path`

`adt-codegen` / rootCodegenPath := (`adt-core`.jvm / baseDirectory).value / ".." / "shared" / "src" / "codegen"

val adtTestAll       = `adt-core`.componentProjects.map(t => t / Test / test)
val injectionTestAll = `injection-core`.componentProjects.map(t => t / Test / test)

adt / Test / test          := (adt / Test / test).dependsOn(adtTestAll: _*).value
injection / Test / test    := (injection / Test / test).dependsOn(injectionTestAll: _*).value
mainProjects / Test / test := (mainProjects / Test / test).dependsOn(adt / Test / test, injection / Test / test).value

val codegenScalaV = scalaV.v3RC
addCommandAlias("preCodegen", s";++$codegenScalaV!;adt-codegen/preCodegenImpl")
addCommandAlias("codegen", s";++$codegenScalaV!;adt-codegen/codegenImpl")
addCommandAlias("executeTest", "+mainProjects/test")