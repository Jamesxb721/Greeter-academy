package App


import App.PredictorApplication._


object predictLogic {

  var calculation = 0
  var min = 0
  var max = 0


  def sportType(st: Option[String]): Unit = {


    st match {
      case Some("1") => min = 0
        max = 4
      case Some("2") => min = 50
        max = 150
      case Some("3") => min = 5
        max = 50
      case None => logicRouter()

    }
    scoreGenerator()
  }

  def scoreGenerator(): Unit = {

    def genNumber(): Int = {
      min + scala.util.Random.nextInt((max - min) + 1)
    }

    val scoreOne = genNumber()
    val scoreTwo = genNumber()
    println(teamOne + " - " + scoreOne + " --- " + scoreTwo + " - " + teamTwo)


    if (scoreOne > scoreTwo)
      println(teamOne + " wins!")
    else if (scoreOne < scoreTwo) {
      println(teamTwo + " wins!")
    }
    else {
      println("Draw!")
    }


  }


}