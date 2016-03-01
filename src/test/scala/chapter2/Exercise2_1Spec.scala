package chapter2

import org.scalatest.{Matchers, FlatSpec}

class Exercise2_1Spec extends FlatSpec with Matchers {

  "Fibonacci" should "return the correct values" in {
    Exercise2_1.fib(0) shouldBe 0
    Exercise2_1.fib(1) shouldBe 1
    Exercise2_1.fib(2) shouldBe 1
    Exercise2_1.fib(3) shouldBe 2
    Exercise2_1.fib(4) shouldBe 3
    Exercise2_1.fib(5) shouldBe 5
    Exercise2_1.fib(6) shouldBe 8
    Exercise2_1.fib(7) shouldBe 13
  }

  "Format" should "return the correct string" in {
    val res = Exercise2_1.format(Exercise2_1.fib, 7, "fibonacci")
    res shouldBe "The fibonacci value of 7 is 13"
  }

}
