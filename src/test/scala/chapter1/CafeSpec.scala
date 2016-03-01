package chapter1

import org.scalatest._

class CafeSpec extends FlatSpec with Matchers {

  val cafe = new Cafe()
  val cc = CreditCard("4751290023458765")

  "A Cafe" should "buy a single cup of coffee" in {
    cafe.buyCoffee(cc)._2.amount shouldBe 3.50
  }

  it should "be able to buy multiple cups of coffee" in {
    cafe.buyCoffees(cc, 2)._2.amount shouldBe 7.00
  }

}
