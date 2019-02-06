package App


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


  def team1(t1: String): Unit = println()

  lazy val t1: String = StdIn.readLine("Enter team 1: ")

  def team2(t2: String): Unit = println()

  lazy val t2: String = StdIn.readLine("Enter team 2: ")


  def sport(ws: String): Unit = println()

  val st: String = StdIn.readLine("Which Sport? (FOOTBALL - 1, BASKETBALL - 2 or RUGBY - 3)")
  st match {
      case "1" => predictLogic.numberOne()
      case "2" => predictLogic.numberTwo()
      case _   => predictLogic.anyOtherNumber()
    }


}

