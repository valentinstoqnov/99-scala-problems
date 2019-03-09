package solutions.p19_rotate_n_places_to_the_left

object P19RotateNPlacesToTheLeft {

  def rotate[A](n: Int, list: List[A]): List[A] = n match {
    case 0 => list
    case remaining if remaining > 0 => rotate(remaining - 1, list.tail ::: List(list.head))
    case remaining if remaining < 0 => rotate(remaining + 1, list.last :: list.dropRight(1))
  }

  def main(args: Array[String]): Unit = {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
