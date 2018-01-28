package solutions.p11_modified_rle

import solutions.p10_run_length_encoding.P10RunLengthEncoding

object P11ModifiedRunLengthEncoding {

  def encodeModified(list: List[Symbol]): List[Any] = P10RunLengthEncoding
    .encode(list) map (xs => if (xs._1 > 1) xs else xs._2)

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeModified(list))
  }

}
