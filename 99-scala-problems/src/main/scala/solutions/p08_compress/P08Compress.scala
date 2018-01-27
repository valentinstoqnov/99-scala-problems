package solutions.p08_compress

object P08Compress {

  def compress(symbols: List[Symbol]): List[Symbol] = {

    def compressRecursive(xs: List[Symbol], res: List[Symbol] = Nil): List[Symbol] = xs match {
      case Nil => res
      case x :: tail => compressRecursive(tail.dropWhile(x ==), res ++ List(x))
    }

    compressRecursive(symbols)

  }

  def main(args: Array[String]): Unit = {
    val list = 'a :: 'a :: 'a :: 'b :: 'c :: 'c :: 'd :: 'b :: Nil
    println(compress(list))
  }

}
