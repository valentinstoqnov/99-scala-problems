package solutions.p13_direct_rle

object P13DirectRle {

  def encodeDirect(list: List[Symbol]): List[(Int, Symbol)] = {

    def encodeRecursive(xs: List[Symbol], res: List[(Int, Symbol)] = Nil): List[(Int, Symbol)] = xs match {
      case Nil => res
      case x :: tail => encodeRecursive(tail.dropWhile(x ==), res ++ List((tail.takeWhile(x ==).length + 1, x)))
    }

    encodeRecursive(list)

  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeDirect(list))
  }

}
