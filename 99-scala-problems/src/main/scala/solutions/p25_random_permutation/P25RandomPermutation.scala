package solutions.p25_random_permutation

import solutions.p23_extract_random_elements.P23ExtractRandomElements

object P25RandomPermutation {

  def randomPermute[A](list: List[A]): List[A] =
    P23ExtractRandomElements.randomSelect(list.length, list)

  def main(args: Array[String]): Unit = {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
