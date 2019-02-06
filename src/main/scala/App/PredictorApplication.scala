package App


import App.predictLogic.sportType

import scala.io.StdIn


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

  logicRouter()


  def team1(t1: String): Unit = println()

  lazy val t1: String = StdIn.readLine("Enter team 1: ")

  def team2(t2: String): Unit = println()

  lazy val t2: String = StdIn.readLine("Enter team 2: ")




    def logicRouter():Unit = {
      val sportInput = StdIn.readLine("Which Sport? (FOOTBALL - 1, BASKETBALL - 2 or RUGBY - 3)")
      if(sportInput == "1"){
        sportType(sportInput)
      }
      else if(sportInput == "2"){
        sportType(sportInput)
      }
      else if(sportInput == "3"){
        sportType(sportInput)
      }
      else{
        logicRouter()
      }
    }

}

