package App

import scala.math.ceil
import App.PredictorApplication._

object predictLogic {

  def numberOne(): Unit = {
    val t1s = ceil(Math.random * 3 + 1)
    val t2s = ceil(Math.random * 3 + 1)
    println(t1 + " - " + t1s + " --- " + t2s + " - " + t2)

    if (t1s > t2s) {
      println(t1 + " wins!")
    }
    else if (t1s < t2s) {
      println(t2 + " wins!")
    }
    else  {
      println("Draw!")
    }

  }

  def numberTwo(): Unit = {
    val t1s = ceil(Math.random * 209 + 1)
    val t2s = ceil(Math.random * 209 + 1)
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

  def anyOtherNumber(): Unit = {
    val t1s = ceil(Math.random * 49 + 1)
    val t2s = ceil(Math.random * 49 + 1)
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
