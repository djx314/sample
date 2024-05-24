package net.scalax.simple.adt

trait AdtFunction[-In, +Out] extends Any {
  def adtFunctionApply(t: In): Out
}
object AdtFunction {
  implicit def contextImplicitApply[In]: AdtFunction[In, In] = new AdtFunction[In, In] {
    def adtFunctionApply(t: In): In = t
  }
}
