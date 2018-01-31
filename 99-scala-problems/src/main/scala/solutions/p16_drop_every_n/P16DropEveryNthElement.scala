package solutions.p16_drop_every_n

object P16DropEveryNthElement {

  def drop[T](n: Int, list: List[T]): List[T] = {

    def dropRecursive(xs: List[T], res: List[T] = Nil, curr: Int = n): List[T] = (curr, xs) match {
      case (_, Nil) => res
      case (1, _ :: tail) => dropRecursive(tail, res)
      case (_, x :: tail) => dropRecursive(tail, res ++ List(x), curr - 1)
    }

    dropRecursive(list)

  }

  def main(args: Array[String]): Unit = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
