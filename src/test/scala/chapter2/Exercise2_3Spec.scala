package chapter2

import org.scalatest.{Matchers, FlatSpec}
import chapter2.Exercise2_3._

class Exercise2_3Spec extends FlatSpec with Matchers {

  def addString = curry[Int, Int, String]((x, y) => s"x+y: ${x+y}")

  def addTo5String = addString(5)

  addTo5String(6) shouldBe "x+y: 11"

}
