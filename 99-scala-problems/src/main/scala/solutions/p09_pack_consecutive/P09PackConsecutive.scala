package solutions.p09_pack_consecutive

object P09PackConsecutive {

  def pack(list: List[Symbol]): List[List[Symbol]] = {

    def packRecursive(xs: List[Symbol], res: List[List[Symbol]]= Nil): List[List[Symbol]] = xs match {
      case Nil => res
      case x :: tail => packRecursive(tail.dropWhile(x ==), res ++ List(x :: tail.takeWhile(x ==)))
    }

    packRecursive(list)
  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(pack(list))
  }

}
