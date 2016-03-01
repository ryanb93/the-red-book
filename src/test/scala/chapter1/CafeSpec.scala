package chapter1

import org.scalatest._

class CafeSpec extends FlatSpec with Matchers {

  val cafe = new Cafe()
  val cc = CreditCard("4751290023458765")

  "A Cafe" should "buy a single cup of coffee" in {
    val cup = Coffee(3.50)
    val order = cafe.generateOrder(cc, cup)
    order.charge.amount shouldBe 3.50
    order.coffees.size shouldBe 1
  }

  it should "be able to buy multiple cups of coffee" in {
    val cups = List(Coffee(3.50), Coffee(4.00), Coffee(5.00))
    val order = cafe.generateOrder(cc, cups)
    order.charge.amount shouldBe 12.50
    order.coffees.size shouldBe 3
  }

}
