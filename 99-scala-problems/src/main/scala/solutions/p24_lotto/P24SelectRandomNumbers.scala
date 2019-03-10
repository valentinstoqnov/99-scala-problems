package solutions.p24_lotto

import solutions.p22_list_from_range.P22ListFromRange
import solutions.p23_extract_random_elements.P23ExtractRandomElements

object P24SelectRandomNumbers {

  def lotto(n: Int, max: Int): List[Int] =
    P23ExtractRandomElements.randomSelect(n, P22ListFromRange.range(1, max))

  def main(args: Array[String]): Unit = {
    println(lotto(6, 49))
  }

}
