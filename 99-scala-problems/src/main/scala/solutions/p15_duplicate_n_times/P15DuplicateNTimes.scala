package solutions.p15_duplicate_n_times

object P15DuplicateNTimes {

  def duplicateN[A](xs: List[A], n: Int) = xs.flatMap(e => List.fill(n)(e))

  def main(args: Array[String]): Unit = {
    println(duplicateN(List('a, 'b, 'c, 'c, 'd), 3))
  }

}
