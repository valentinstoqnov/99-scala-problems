package solutions.p10_run_length_encoding

import solutions.p09_pack_consecutive.P09PackConsecutive

object P10RunLengthEncoding {

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {

    def encodeRecursive(xs: List[List[Symbol]], res: List[(Int, Symbol)] = Nil): List[(Int, Symbol)] = xs match {
      case Nil => res
      case x :: tail => encodeRecursive(tail, res ++ List((x.length, x.head)))
    }

    encodeRecursive(P09PackConsecutive.pack(list))

  }

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(list))
  }

}
