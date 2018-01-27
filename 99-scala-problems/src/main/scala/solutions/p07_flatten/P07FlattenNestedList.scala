package solutions.p07_flatten

object P07FlattenNestedList {

  def flatten(xs: List[Any]): List[Any] = xs flatMap {
    case list: List[Any] => flatten(list)
    case value => List(value)
  }

  def main(args: Array[String]): Unit = {
    val list = List(List(1, 2), 3, 4, List(200, 300))
    println(flatten(list))
  }

}
