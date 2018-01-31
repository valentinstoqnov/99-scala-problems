package solutions.p18_slice_list

object P18SliceList {

  def slice[T](start: Int, end: Int, list: List[T]): List[T] = {

    def sliceRec(xs: List[T], res: List[T] = Nil, curr: Int = 0): List[T] = (curr, xs) match {
      case (_, Nil) => res.reverse
      case (_, x :: tail)  =>
        val result = if (start until end contains curr) x :: res else res
        sliceRec(tail, result, curr + 1)
    }

    sliceRec(list)

  }

  def main(args: Array[String]): Unit = {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
