package solutions.p03_find_nth_element

object P03NthElement {

  def nth[A](n: Int, xs: List[A]): A = n match {
    case 0 => if (xs.nonEmpty) xs.head else throw new NoSuchElementException
    case neg if neg < 0 => throw new IllegalArgumentException
    case _ => if (xs.nonEmpty) nth(n - 1, xs.tail) else throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(0, 1, 2, 500, 4, 5, 6)
    println(nth(3, list))
  }

}
