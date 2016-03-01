package chapter2

object Exercise2_2 {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {

    def loop(n: Int, result: Boolean): Boolean = {
      if(n >= as.length - 1) result
      else loop(n + 1, result && ordered(as(n), as(n+1)))
    }

    loop(0, true)

  }

}
