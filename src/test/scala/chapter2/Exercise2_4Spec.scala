package chapter2

import chapter2.Exercise2_3._
import chapter2.Exercise2_4._
import org.scalatest.{Matchers, FlatSpec}

class Exercise2_4Spec extends FlatSpec with Matchers {

  def curryString = curry[Int, Int, String]((x, y) => s"x+y: ${x+y}")

  def printAdd = uncurry[Int, Int, String](curryString)

  printAdd(3, 5) shouldBe "x+y: 8"

}
