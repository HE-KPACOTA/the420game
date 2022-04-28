//The 420 app v0.1

import scala.io.StdIn

object HelloWorldApp2 extends App {
  val magicNumber = 420
  var answer = StdIn.readLine("What is answer on all questions? It's the: ").toInt
  while (answer != magicNumber) {
    if (answer > magicNumber) {
      println("No, it's smaller")
      answer = StdIn.readLine("What is answer on all questions? It's the: ").toInt
    }
    if (answer < magicNumber) {
      println("No, it's bigger")
      answer = StdIn.readLine("What is answer on all questions? It's the: ").toInt
    }
  }
  println("It's correct, go and high!")


}
