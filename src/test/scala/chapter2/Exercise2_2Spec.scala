package chapter2

import org.scalatest.{Matchers, FlatSpec}
import Exercise2_2._

class Exercise2_2Spec extends FlatSpec with Matchers {

  val order = (x: Int, y: Int) => x <= y

  "isSorted" should "return true for a sorted array" in {
    val sorted = Array[Int](0,1,2,2,4,5,6)
    isSorted(sorted, order) shouldBe true
  }

  it should "return false for an unsorted array" in {
    val unsorted = Array[Int](0,1,5,3,4,5,6)
    isSorted(unsorted, order) shouldBe false
  }

  it should "return false for an empty array" in {
    isSorted(Array(), order) shouldBe false
  }

}
