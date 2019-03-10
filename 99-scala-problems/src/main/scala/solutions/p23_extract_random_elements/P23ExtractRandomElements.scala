package solutions.p23_extract_random_elements

import solutions.p20_remove_kth_element.P20RemoveKthElement

object P23ExtractRandomElements {

  def randomSelect[A](n: Int, list: List[A]): List[A] = {

    def randomSelectRec(n: Int, list: List[A], rand: util.Random, acc: List[A]): List[A] =
      if (n <= 0) acc
      else {
        val (remained, removed) = P20RemoveKthElement.removeAt(rand.nextInt(list.length), list)
        randomSelectRec(n - 1, remained, rand, removed :: acc)
      }

    randomSelectRec(n, list, new util.Random, Nil)
  }

  def main(args: Array[String]): Unit = {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

}
