
/**
  * Created by MB on 17/04/2019.
  */
object E2 {

  private def areaCirculo(radio: Double): Double = {
    Math.PI * (radio * radio);
  }

  def main(args: Array[String]): Unit = {
    println(areaCirculo(10.0))
  }

}
