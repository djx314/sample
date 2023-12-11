package net.scalax.simple.codec.unzip_generic

import net.scalax.simple.codec.{SimpleFrom, SimpleTo}
import shapeless._

trait Func2Generic[F[_[_]]] {
  def function0[T[_]](func: Func2Generic.Func1Func[T]): F[T]
  def funcion1[T1[_], T2[_]](func: Func2Generic.Func2Func[T1, T2]): F[T1] => F[T2] = {
    type Func1[X] = T1[X] => T2[X]
    val func3 = new Func2Generic.Func3Func[Func1, T1, T2] {
      override def apply[X]: (T1[X] => T2[X]) => T1[X] => T2[X] = identity[T1[X] => T2[X]]
    }
    val func4: F[Func1] => F[T1] => F[T2] = function2[Func1, T1, T2](func3)
    val func2: Func2Generic.Func1Func[Func1] = new Func2Generic.Func1Func[Func1] {
      override def apply[U]: T1[U] => T2[U] = t => func(t)
    }
    val inputFunc: F[Func1] = function0[Func1](func2)
    func4(inputFunc)
  }
  def function2[S[_], T[_], U[_]](func2Func: Func2Generic.Func3Func[S, T, U]): F[S] => F[T] => F[U]
}

object Func2Generic {
  type IdImpl[T] = T

  trait Func1Func[T[_]] {
    def apply[U]: T[U]
  }

  trait Func2Func[T1[_], T2[_]] {
    def apply[U](in: T1[U]): T2[U]
  }

  trait Func3Func[S[_], T[_], U[_]] {
    def apply[X]: S[X] => T[X] => U[X]
  }

  // ===
  trait HListFuncMap[HListInput, T[_], FuncOut] {
    def input(func: Func1Func[T]): FuncOut
  }
  object HListFuncMap {
    implicit def implicit1[In, T[_], HImplHList <: HList, HListOut <: HList](implicit
      tailImpl: HListFuncMap[HImplHList, T, HListOut]
    ): HListFuncMap[In :: HImplHList, T, T[In] :: HListOut] = new HListFuncMap[In :: HImplHList, T, T[In] :: HListOut] {
      override def input(func: Func1Func[T]): T[In] :: HListOut = func[In] :: tailImpl.input(func)
    }

    implicit def implicit2[T[_]]: HListFuncMap[HNil, T, HNil] = new HListFuncMap[HNil, T, HNil] {
      override def input(func: Func1Func[T]): HNil = HNil
    }
  }

  trait HListFuncMapGeneric[In, T[_]] {
    def generic[HListOut](implicit io: HListFuncMap[In, T, HListOut]): HListFuncMap[In, T, HListOut] = io
  }
  object HListFuncMapGeneric {
    def apply[In, T[_]]: HListFuncMapGeneric[In, T] = new HListFuncMapGeneric[In, T] {
      //
    }
  }

  // ===
  trait HListZipMap[HListInput, S[_], T[_], G[_], ZipIn, Out1, Out2] {
    def input(in1: Func3Func[S, T, G]): ZipIn => Out1 => Out2
  }
  object HListZipMap {
    implicit def implicit1[In, S[_], T[_], G[_], HImplHList <: HList, ZipIn <: HList, HOut1 <: HList, HOut2 <: HList](implicit
      tailImpl: HListZipMap[HImplHList, S, T, G, ZipIn, HOut1, HOut2]
    ): HListZipMap[In :: HImplHList, S, T, G, S[In] :: ZipIn, T[In] :: HOut1, G[In] :: HOut2] =
      new HListZipMap[In :: HImplHList, S, T, G, S[In] :: ZipIn, T[In] :: HOut1, G[In] :: HOut2] {
        override def input(in1: Func3Func[S, T, G]): (S[In] :: ZipIn) => (T[In] :: HOut1) => (G[In] :: HOut2) = { sIn1 => sOut1 =>
          in1[In](sIn1.head)(sOut1.head) :: tailImpl.input(in1)(sIn1.tail)(sOut1.tail)
        }
      }

    implicit def implicit2[S[_], T[_], G[_]]: HListZipMap[HNil, S, T, G, HNil, HNil, HNil] =
      new HListZipMap[HNil, S, T, G, HNil, HNil, HNil] {
        override def input(in1: Func3Func[S, T, G]): HNil => HNil => HNil = { _ => _ =>
          HNil
        }
      }
  }

  trait HListZipMapGeneric[In, S[_], T[_], G[_]] {
    def generic[ZipInput, HOut1, HOut2](implicit
      io: HListZipMap[In, S, T, G, ZipInput, HOut1, HOut2]
    ): HListZipMap[In, S, T, G, ZipInput, HOut1, HOut2] = io
  }
  object HListZipMapGeneric {
    def apply[In, S[_], T[_], G[_]]: HListZipMapGeneric[In, S, T, G] = new HListZipMapGeneric[In, S, T, G] {
      //
    }
  }

  // ===
  class SimpleFuncion1Impl[F[_[_]], S[_]] {
    self =>
    def derived2[Target1](simpleTo: SimpleTo[F[IdImpl], Target1]): FuncInnerApply1[F, S, Target1] = new FuncInnerApply1[F, S, Target1]
  }

  class FuncInnerApply1[F[_[_]], S[_], Target1] {
    def apply[U1](
      genericFunc: HListFuncMapGeneric[Target1, S] => HListFuncMap[Target1, S, U1]
    ): FuncInnerApply2[F, S, U1, Target1] =
      new FuncInnerApply2[F, S, U1, Target1](genericFunc(HListFuncMapGeneric[Target1, S]))
  }

  class FuncInnerApply2[F[_[_]], S[_], U1, Unused](t: HListFuncMap[Unused, S, U1]) {
    def apply(
      simpleTo: SimpleFrom[F[S], U1]
    ): Func1Func[S] => F[S] = u => simpleTo.from(t.input(u))
  }

  // ===
  class SimpleUnZip2Impl[F[_[_]], S[_], T[_], G[_]] {
    self =>
    def derived2[Target1](simpleTo: SimpleTo[F[IdImpl], Target1]): ZipInnerApply1[F, S, T, G, Target1] =
      new ZipInnerApply1[F, S, T, G, Target1]
  }

  class ZipInnerApply1[F[_[_]], S[_], T[_], G[_], Target1] {
    def apply[ZipInput, U1, U2](
      genericFunc: HListZipMapGeneric[Target1, S, T, G] => HListZipMap[Target1, S, T, G, ZipInput, U1, U2]
    ): ZipInnerApply2[F, S, T, G, ZipInput, U1, U2, Target1] =
      new ZipInnerApply2[F, S, T, G, ZipInput, U1, U2, Target1](genericFunc(HListZipMapGeneric[Target1, S, T, G]))
  }

  class ZipInnerApply2[F[_[_]], S[_], T[_], G[_], ZipInput, U1, U2, Unused](t: HListZipMap[Unused, S, T, G, ZipInput, U1, U2]) {
    def apply(
      to1: SimpleTo[F[S], ZipInput],
      to2: SimpleTo[F[T], U1],
      from1: SimpleFrom[F[G], U2]
    ): Func3Func[S, T, G] => F[S] => F[T] => F[G] = in1 => fs => ft => from1.from(t.input(in1)(to1.to(fs))(to2.to(ft)))
  }

  trait Impl[F[_[_]]] extends Func2Generic[F] {
    def impl1[T1[_]]: SimpleFuncion1Impl[F, T1] => Func1Func[T1] => F[T1]
    def impl2[T1[_], T2[_], T3[_]]: SimpleUnZip2Impl[F, T1, T2, T3] => Func2Generic.Func3Func[T1, T2, T3] => F[T1] => F[T2] => F[T3]
    override def function0[T[_]](func: Func2Generic.Func1Func[T]): F[T] = impl1[T](new SimpleFuncion1Impl[F, T])(func)
    override def function2[S[_], T[_], U[_]](func2Func: Func2Generic.Func3Func[S, T, U]): F[S] => F[T] => F[U] =
      impl2[S, T, U](new SimpleUnZip2Impl[F, S, T, U])(func2Func)
  }

}

class BB(val aa: String) extends AnyVal
