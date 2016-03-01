package chapter2

object Exercise2_1 {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(previous: Int, current: Int, count: Int): Int = {
      if(count == n) current
      else go(current, previous + current, count + 1)
    }
    go(1, 0, 0)
  }

  def fact(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)
  }

  def format(f: Int => Int, n: Int, name: String): String = s"The $name value of $n is ${f(n)}"

}
