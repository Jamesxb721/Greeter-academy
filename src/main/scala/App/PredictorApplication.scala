package App

import scala.io.StdIn
import scala.math.ceil

object PredictorApplication extends App {
  def greet(name: String): Unit = println()

  var name: String = StdIn.readLine("Enter Username: ")
  greet(name)
  acc(name)


  def acc(name: String): Unit =
    if (name != "James") {
      println(s"Denied")
      val name: String = StdIn.readLine("Enter Username: ")
      acc(name)
    }
    else
      println(s"Accepted")
  def team1(t1: String): Unit = println()
  var t1: String = StdIn.readLine("Enter team 1: ")
  def team2(t2: String): Unit = println()
  var t2: String = StdIn.readLine("Enter team 2: ")
  def sport(ws: String): Unit =println()
  var st: String = StdIn.readLine("Which Sport? (FOOTBALL - 1, BASKETBALL - 2 or RUGBY - 3)")
  if(st == "1"){
    def score1(t1s: Int): Unit = println()
    val t1s = ceil(Math.random * 3 + 1)
    def score2(t2s: Int): Unit = println()
    val t2s = ceil(Math.random * 3 + 1)
    println(t1 + " - " + t1s + " --- " + t2s + " - " + t2)
    if (t1s > t2s) {
      println(t1 + " wins!")
    }
    else if (t1s < t2s) {
      println(t2 + " wins!")
    }
    else {
      println("Draw!")
    }}
  else if(st == "2"){
    def score1(t1s: Int): Unit = println()
    val t1s = ceil(Math.random * 209 + 1)
    def score2(t2s: Int): Unit = println()
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
    }}
  else {
    def score1(t1s: Int): Unit = println()

    val t1s = ceil(Math.random * 49 + 1)

    def score2(t2s: Int): Unit = println()

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

