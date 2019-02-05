package App

import scala.math._
import scala.io.StdIn

object GreeterApplication extends App {
  def greet(name: String): Unit = println()

  var name: String = StdIn.readLine("What's your name? ")
  greet(name)
  acc(name)


  def acc(name: String): Unit =
    if (name != "James") {
      println(s"Denied")
      var name: String = StdIn.readLine("What's your name? ")
      acc(name)
    }
    else
      println(s"Accepted")
      def team1(t1: String): Unit = println()
      var t1: String = StdIn.readLine("Enter team 1 ")




      def team2(t2: String): Unit = println()
      var t2: String = StdIn.readLine("Enter team 2 ")




      def score1(t1s: Int): Unit = println()
      val t1s = {
        ceil(Math.random * 5 + 1)
  }




      def score2(t2s: Int): Unit = println()
      val t2s = {
        ceil(Math.random * 5 + 1)
  }
      println(t1 + " " + t1s + "----" + t2s + " " + t2)






}

