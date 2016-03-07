package chapter2

import Exercise2_5._
import org.scalatest.{Matchers, FlatSpec}

class Exercise2_5Spec extends FlatSpec with Matchers {

  "compose" should "compose two functions correctly" in {

    val f: (String => Int) = (s: String) => s.toInt + 1
    val g: (Int) => (String) = (a: Int) => s"Number: $a"

    def addOneToString = compose(f, g)

    addOneToString(5) shouldBe "Number: 6"

  }


}
