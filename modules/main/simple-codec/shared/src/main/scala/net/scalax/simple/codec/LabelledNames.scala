package net.scalax.simple
package codec

trait LabelledNames[F[_[_]]] {
  def names: List[String]
}
object LabelledNames extends impl.LabelledNamesImplExtra