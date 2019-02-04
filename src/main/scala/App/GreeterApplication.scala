package App

import scala.io.StdIn

  object GreeterApplication extends App {
    def greet(name: String): Unit = println(s"Hello $name")

    var name: String = StdIn.readLine("What's your name? ")
    greet(name)
    acc(name)



    def acc(name: String): Unit =
      if (name != "James"){
        println(s"Denied")
        var name: String = StdIn.readLine("What's your name? ")
        acc(name)}
      else{
        println(s"Accepted")}}

    def num(rand : Int)










