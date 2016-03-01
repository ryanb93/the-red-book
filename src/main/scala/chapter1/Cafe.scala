package chapter1

case class Coffee(price: Double)

case class CreditCard(number: String)

case class Order(coffees: List[Coffee], charge: Charge)

case class Charge(cc: CreditCard, amount: Double) {
  def combine(other: Charge): Charge = {
    if(cc == other.cc) Charge(cc, amount + other.amount)
    else throw new Exception("Can't combine charges to different cards.")
  }
}

class Cafe {
  def coalesce(charges: List[Charge]): List[Charge] = charges.groupBy(_.cc).values.map(_.reduce(_ combine _)).toList
  def generateOrder(cc: CreditCard, cup: Coffee): Order = Order(List(cup), Charge(cc, cup.price))
  def generateOrder(cc: CreditCard, cups: List[Coffee]): Order = Order(cups, cups.map(generateOrder(cc, _).charge).reduce(_ combine _))
}

