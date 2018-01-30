package solutions.p14_duplicate_elements

object P14DuplicateElements {

  def duplicate(list: List[Symbol]): List[Symbol] = list flatMap (e => List.fill(2)(e))

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'c, 'd)
    println(duplicate(list))
  }

}
