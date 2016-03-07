package chapter3

object Exercise3_1 {

  sealed trait List[+A]
  case object Nil extends List[Nothing]
  case class Cons[+A](head: A, tail: List[A]) extends List[A]

  object List {

    def sum[A](list: List[A], f: (A, Int) => Int): Int = list match {
      case Nil => 0
      case Cons(h, t) => f(h, sum(t, f))
    }

    def apply[A](as: A*): List[A] =
      if (as.isEmpty) Nil
      else Cons(as.head, apply(as.tail: _*))

  }

}
