package App

import scala.math.ceil
import App.PredictorApplication._


object predictLogic {

  var calculation = 0

  def sportType(st: String): Unit = {


    st match {
      case "1" => calculation = 3
      case "2" => calculation = 189
      case "3" => calculation = 49
      case _ => logicRouter()




    }
    scoreGenerator()
  }

  def scoreGenerator(): Unit = {
    val t1s = ceil(Math.random * calculation)
    val t2s = ceil(Math.random * calculation)
    println(t1 + " - " + t1s + " --- " + t2s + " - " + t2)

    if (t1s > t2s) {
      println(t1 + " wins!")
    }
    else if (t1s < t2s) {
      println(t2 + " wins!")
    }
    else {
      println("Draw!")
    }

  }

}
