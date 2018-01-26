package solutions.p02_find_penultimate_element

object P02PenultimateElement {

  def penultimate[A](xs: List[A]): A = xs match {
    case x :: Nil if xs.lengthCompare(1) == 0 => x
    case x :: _ :: Nil=> x
    case x :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(2, 5, 20, 60)
    println(penultimate(list))
  }

}
