package main.scala.solutions.p01_find_last_element

object P01LastElement {

  def lastBuiltIn[A](xs: List[A]): A = xs.last

  def lastRecursive[A](xs: List[A]): A = xs match {
    case x :: Nil => x
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 1, 50)
    println(lastBuiltIn(list))
    println(lastRecursive(list))
  }

}
