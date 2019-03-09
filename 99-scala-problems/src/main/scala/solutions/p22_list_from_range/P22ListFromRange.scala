package solutions.p22_list_from_range

object P22ListFromRange {

  def range(start: Int, end: Int): List[Int] = {

    def rangeRec(curr: Int, acc: List[Int]): List[Int] = curr match {
      case n if n > end => acc.reverse
      case _ => rangeRec(curr + 1, curr :: acc)
    }

    rangeRec(start, Nil)
  }

  def main(args: Array[String]): Unit = {
    println(range(4, 9))
  }

}
