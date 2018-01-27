package solutions.p06_palindrome

object P06Palindrome {

  def isPalindrome[A](xs: List[A]): Boolean = {

    def palindromeRec(list: List[A], result: Boolean = true): Boolean = list match {
      case Nil => result
      case _ :: Nil => result
      case head :: tail => palindromeRec(tail.dropRight(1), head == tail.last)
    }

    palindromeRec(xs)

  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 3, 2, 1)
    println(isPalindrome(list))
  }

}
