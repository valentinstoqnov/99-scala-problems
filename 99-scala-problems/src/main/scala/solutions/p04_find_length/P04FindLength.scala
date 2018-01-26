package solutions.p04_find_length

object P04FindLength {

  def length[A](list: List[A]): Int = {

    def lengthRecursive(xs: List[A], length: Int = 0): Int = xs match {
      case _ :: tail => lengthRecursive(tail, length + 1)
      case Nil => length
    }

    lengthRecursive(list)

  }

  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 50, 4)
    println(length(list))
  }

}
