package App


import App.predictLogic.sportType

import scala.io.StdIn


object PredictorApplication extends App {


  def userFilter(name: String): Unit = println()

  var name: String = StdIn.readLine("Enter Username: ").toUpperCase
  userFilter(name)
  secondFilter(name)

  def secondFilter(name: String): Unit =
    name match {
      case "JAMES" => println("Accepted")
      case _ => println("Denied")
        val name: String = StdIn.readLine("Enter Username: ")
        secondFilter(name)
    }


  logicRouter()


  def enterTeam1(teamOne: String): Unit = println()

  lazy val teamOne: String = StdIn.readLine("Enter team 1: ")

  def enterTeam2(teamTwo: String): Unit = println()

  lazy val teamTwo: String = StdIn.readLine("Enter team 2: ")


  def logicRouter(): Unit = {
    val sportInput = StdIn.readLine("Which Sport? (FOOTBALL - 1, BASKETBALL - 2 or RUGBY - 3)")
    sportInput match {
      case "1" | "2" | "3" => sportType(sportInput)
      case _ => println("Please enter a valid number!!!")
        logicRouter()
    }
  }
}





