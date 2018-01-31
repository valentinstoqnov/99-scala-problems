package solutions.p17_split_list

object P17SplitList {

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {

    def splitRec(xs: List[T], res: (List[T], List[T]) = (Nil, Nil), curr: Int = 0): (List[T], List[T]) = (curr, xs) match {
      case(c, x :: tail) =>
        if (c < n) splitRec(tail, (res._1 ++ List(x), res._2), curr + 1)
        else (res._1, res._2 ++ (x :: tail))
      case(_, _) => res
    }

    splitRec(list)

  }

  def main(args: Array[String]): Unit = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
