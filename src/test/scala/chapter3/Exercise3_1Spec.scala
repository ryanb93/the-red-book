package chapter3

import chapter3.Exercise3_1._
import chapter3.Exercise3_1.List._
import org.scalatest.{FlatSpec, Matchers}

class Exercise3_1Spec extends FlatSpec with Matchers {

  "List" should "correctly pattern match" in {
    val x = List(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + sum[Int](t, _ + _)
      case _ => 101
    }


    x shouldBe 3

  }

  it should "correctly sum lists" in {
    val sumString = (a: String, b: Int) => a.length + b
    val x = List("hello", "world")
    List.sum(x, sumString) shouldBe 10
  }

}
