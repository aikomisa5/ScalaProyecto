/**
  * Created by PC on 01/05/2019.
  */
object Prueba {
  /*
  val m: List[String] = List("a")

  def main (args: Array[String]): Unit = {
    println(m.head)
  }
  */

  21
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, atc: Int): Int =
      if (n <= 0) atc
      else go(n - 1, n * atc)
    go(n, 1)
  }

  def main (args: Array[String]): Unit = {
    println(factorial(5))
  }

}
