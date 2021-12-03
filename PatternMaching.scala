package PatternMatching

import scala.util.Random

object PatternMaching extends App {

  val random = new Random
  val x = random.nextInt(10)

  val description = x match {
    case 0 => "Zero"
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "More than Three"
  }

  println(x)
  println(description)

  //1.Decomposition of Values
  case class Person(name:String,age:Int)
  val bob = Person("Bob",20)
  val mary = Person("Mary",22)
  val greetings = bob match {
    case Person(n,a) if a<21 => s"Hi, I am $n and I am $a years old,Ihsadasd"
    case Person(n,a) => s"Hi, I am $n and I am $a years old"
    case _ => "IDK"
  }
  println(greetings)

  //
}
