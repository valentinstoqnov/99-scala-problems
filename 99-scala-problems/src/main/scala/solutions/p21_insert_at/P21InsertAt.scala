package solutions.p21_insert_at

object P21InsertAt {

  def insertAt[A](element: A, pos: Int, list: List[A]): List[A] =
    if (pos < 0) throw new IllegalArgumentException
    else (pos, list) match {
      case (0, xs) => element :: xs
      case (_, head :: tail) => head :: insertAt(element, pos - 1, tail)
    }

  def main(args: Array[String]): Unit = {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }

}
