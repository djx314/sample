package net.scalax.simple.nat.乘除法20231010

import net.scalax.simple.adt.{TypeAdt => Adt}

object 乘除法喵 {

  def main(arr: Array[String]): Unit = {
    object num1 {
      val Parent: Int = 24
      val Sub: Int    = 547
    }
    object num2 {
      val Parent: Int = 485
      val Sub: Int    = 711
    }
    object num3 {
      val Parent: Int = 57
      val Sub: Int    = 27
    }
    lazy val num1GHDMZSK: 合集.InputNum = 统计.gen(leftBuilder = t => new 合集.InputNum1(t), rightBuilder = t => new 合集.InputNum2(t))(
      leftLength = num1.Parent,
      rightLength = num1.Sub
    )(num1GHDMZSK)
    lazy val num2GHDMZSK: 合集.InputNum = 统计.gen(leftBuilder = t => new 合集.InputNum3(t), rightBuilder = t => new 合集.InputNum4(t))(
      leftLength = num2.Parent,
      rightLength = num2.Sub
    )(num2GHDMZSK)
    lazy val num3GHDMZSK: 合集.InputNum = 统计.gen(leftBuilder = t => new 合集.InputNum5(t), rightBuilder = t => new 合集.InputNum6(t))(
      leftLength = num3.Parent,
      rightLength = num3.Sub
    )(num3GHDMZSK)

    val numMapInput: Map[Int, 合集.InputNum] = Map(1 -> num2GHDMZSK, 3 -> num3GHDMZSK)
    val execResultForInput: Adt.CoProduct2[合集.NumCountLeft, 合集.NumCountRight] =
      num1GHDMZSK.fold(a => a.input(numMapInput), a => a.input(numMapInput))

    val bigDecimal1: BigDecimal = BigDecimal(num1.Sub) / BigDecimal(num1.Parent)
    val bigDecimal2: BigDecimal = BigDecimal(num2.Sub) / BigDecimal(num2.Parent)
    val bigDecimal3: BigDecimal = BigDecimal(num3.Sub) / BigDecimal(num3.Parent)
    统计.confirm(() => execResultForInput, except = bigDecimal1 * bigDecimal2 * bigDecimal3)

  }

}
