package main.scala.clase2

/**
  * Created by PC on 18/04/2019.
  */
object E3 {
  private def printear(numero: Int): Unit = {
    if (numero < 50)
      printear(numero+5)
    else
      1

  }

  def main(args: Array[String]): Unit = {
    println(printear(5))
  }
}
