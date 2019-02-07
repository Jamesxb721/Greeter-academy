package App


import App.PredictorApplication._


object predictLogic {

  var calculation = 0
  var min = 0
  var max = 0


  def sportType(st: String): Unit = {


    st match {
      case "1" => min = 0
        max = 5
      case "2" => min = 50
        max = 160
      case "3" => min = 5
        max = 50

    }
    scoreGenerator()
  }

  def scoreGenerator(): Unit = {
    val scoreOne = min + scala.util.Random.nextInt((max - min) + 1)
    val scoreTwo = min + scala.util.Random.nextInt((max - min) + 1)
    println(teamOne + " - " + scoreOne + " --- " + scoreTwo + " - " + teamTwo)


    if (scoreOne > scoreTwo) {
      println(teamOne + " wins!")
    }
    else if (scoreOne < scoreTwo) {
      println(teamTwo + " wins!")
    }
    else {
      println("Draw!")
    }


  }

}








