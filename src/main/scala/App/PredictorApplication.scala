package App


import App.predictLogic.sportType

import scala.io.StdIn


object PredictorApplication extends App {


  def userFilter(name: String): Unit = println()

  var name: String = StdIn.readLine("Enter Username: ").toUpperCase
  userFilter(name)
  userRefilter(name)

  def userRefilter(name: String): Unit =
    name match {
      case "JAMES" => println("Accepted")
      case _ => println("Denied")
        val name: String = StdIn.readLine("Enter Username: ")
        userRefilter(name)
    }


  logicRouter()


  def teamOne(t1: String): Unit = println()

  lazy val t1: String = StdIn.readLine("Enter team 1: ")

  def teamTwo(t2: String): Unit = println()

  lazy val t2: String = StdIn.readLine("Enter team 2: ")


  def logicRouter(): Unit = {
    val sportInput = StdIn.readLine("Which Sport? (FOOTBALL - 1, BASKETBALL - 2 or RUGBY - 3)")
    sportInput match {
      case "1" | "2" | "3" => sportType(sportInput)
      case _ => println("Please enter a valid number!!!")
        logicRouter()
    }
  }
}






