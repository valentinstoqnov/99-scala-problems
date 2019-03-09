package solutions.p20_remove_kth_element

import java.util.NoSuchElementException

object P20RemoveKthElement {

  def removeAt[A](k: Int, list: List[A]): (List[A], A) =
    if (k < 0) throw new IllegalArgumentException
    else (k, list) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, head :: tail) => (tail, head)
      case (_, head :: tail) => {
        val (remained, removed) = removeAt(k - 1, tail)
        (head :: remained, removed)
      }
    }

  def main(args: Array[String]) {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

}
