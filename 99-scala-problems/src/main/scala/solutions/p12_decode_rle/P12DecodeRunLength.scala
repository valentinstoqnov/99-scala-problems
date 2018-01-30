package solutions.p12_decode_rle

object P12DecodeRunLength {

  def decode(list: List[(Int, Symbol)]): List[Symbol] = {

    def decodeRecursive(xs: List[(Int, Symbol)], res: List[Symbol] = Nil): List[Symbol] = xs match {
      case Nil => res
      case x :: tail => decodeRecursive(tail, res ++ List.fill(x._1)(x._2))
    }

    decodeRecursive(list)

  }

  def main(args: Array[String]): Unit = {
    val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    println(decode(list))
  }

}
