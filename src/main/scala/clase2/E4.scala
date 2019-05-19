package main.scala.clase2

/**
  * Created by PC on 21/04/2019.
  */
object E4 {

  private def powe(x: Double, y: Int, acumulador: Double = 1): Double = {
    if (x == 0)
      0
    else if (y == 0)
      return acumulador
    else
      powe(x,y-1,acumulador*x)

  }

  def main(args: Array[String]): Unit = {
    println(powe(5.0,3,acumulador = 1.0))
  }


}
