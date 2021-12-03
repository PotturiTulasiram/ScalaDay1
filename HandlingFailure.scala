package FunctionsInScala

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App {
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Super Failure"))

  println(aSuccess)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("Ni string")
  val value = Try(unsafeMethod())
  println(value)
}
