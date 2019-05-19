package main.scala.clase3
/**
  * Created by PC on 28/04/2019.
  */

object E1 {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, anterior: Int, actual: Int): Int =
      if(n==0) anterior
      else loop (n -1, actual, anterior + actual)
    loop(n, 0, 1)
  }

  def main (args: Array[String]): Unit = {
    println(fib(3))
  }
}
