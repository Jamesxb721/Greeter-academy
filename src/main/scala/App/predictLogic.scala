package App

import scala.math.ceil
import App.PredictorApplication._


object predictLogic {

  var calculation = 0
  var start = 0
  var end = 0


  def sportType(st: String): Unit = {


    st match {
      case "1" => start = 0
                  end = 5
      case "2" => start = 50
                  end = 160
      case "3" => start = 5
                  end = 50

    }
    scoreGenerator()
  }

  def scoreGenerator(): Unit = {
    val t1s = start + scala.util.Random.nextInt((end-start)+1)
    val t2s = start + scala.util.Random.nextInt((end-start)+1)
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








