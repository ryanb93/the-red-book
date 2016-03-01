package chapter2

object Exercise2_2 {

  def isSorted[A](array: Array[A], ordered: (A,A) => Boolean): Boolean = {
    if(array.isEmpty) false else (array, array.tail).zipped.forall(ordered)
  }

}
