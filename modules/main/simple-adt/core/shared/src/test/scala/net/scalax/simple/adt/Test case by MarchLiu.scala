package net.scalax.simple.adt.test

import net.scalax.simple.adt.{TypeAdt => Adt}
import scala.collection.compat._

import zio._
import zio.test._
import zio.test.Assertion._

/** @author
  *   MarchLiu
  */
object TestCase4 extends ZIOSpecDefault {

  type TypeOpt[T] = Adt.Options3[Seq[T], Seq[String], Seq[Int], Seq[Option[Long]]]
  def inputOptData[T: TypeOpt](t: T*): Seq[Option[Long]] = {
    val applyM = Adt.Options3[Seq[String], Seq[Int], Seq[Option[Long]]](t)
    applyM.fold(
      t1 => t1.map(t => Some(t.length.toLong)),
      t2 => t2.map(t => Some(t.toLong)),
      t3 => t3
    )
  }

  override def spec: Spec[TestEnvironment with Scope, Any] = suite("Test case created by MarchLiu")(
    test("Simple adt fold in parameter list.") {
      def assert1 = {
        val r1 = inputOptData("aa", "ofjhiwehr", "sdfweer")
        val r2 = List("aa".length, "ofjhiwehr".length, "sdfweer".length)
        val r3 = r2.map(t => Some(t.toLong))
        assert(r1)(Assertion.equalTo(r3))
      }

      def assert2 = {
        val l  = (1 to 100).to(List)
        val r1 = inputOptData(l: _*)
        val r2 = l.map(t => Some(t.toLong))
        assert(r1)(Assertion.equalTo(r2))
      }

      def assert3 = {
        val l  = (1 to 100).to(List).map(t => Some(t.toLong))
        val r1 = inputOptData(l: _*)
        val r2 = l
        assert(r1)(Assertion.equalTo(r2))
      }

      try assert1 && assert2 && assert3
      catch {
        case _: StackOverflowError => assertNever("Not allow adt access.")
      }
    }
  )
}