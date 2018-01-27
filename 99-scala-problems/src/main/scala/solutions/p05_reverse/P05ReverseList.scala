package solutions.p05_reverse

object P05ReverseList {

  def reverse[A](xs: List[A]): List[A] = {

    def reverseRecursive(list: List[A], resultList: List[A] = Nil): List[A] = list match {
      case Nil => resultList
      case head :: tail => reverseRecursive(tail, head :: resultList)
    }

    reverseRecursive(xs)

  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 20, 60, 1, 2, 5)
    println(reverse(list))
  }

}
