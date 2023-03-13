scalaVersion := scalaV.v213
name         := "simple-adt-core"

libraryDependencies ++= libScalax.`kind-projector`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.circe.value.map(_ % Test)
libraryDependencies ++= libScalax.`zio2`.value.map(_ % Test)
libraryDependencies ++= libScalax.`binding.scala`.value

enableZIOTest := true

crossScalaVersions := Seq(scalaV.v211, scalaV.v212, scalaV.v213, scalaV.v3)
