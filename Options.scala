package FunctionsInScala

object Options extends App {
  val aOption : Option[Int] = Some(4)
  val noOption:Option[Int] = None

  println(aOption)

  def unsafeMethod():String = null
  //val res = Some(unsafeMethod) --- Wrong Implementation
  val res = Option(unsafeMethod())
  println(res)

  //chained Methods
  def backupMethod():String = "Hello Scala"

  val chainedRes = Option(unsafeMethod()).orElse(Option(backupMethod()))
  println(chainedRes)

   //Better backup Option
   def betterUnsafeMethod():Option[String] = None
   def betterBackupMethod():Option[String] = Some("Hello Scala")

   val betterChainedes = betterUnsafeMethod().orElse(betterBackupMethod())
   println(betterChainedes)

    //Functions on option
    println(aOption.isEmpty)

    //map,flatMpa,Filtet
    println(aOption.map(_*2))
    println(aOption.filter((x => x>10)))
    println(aOption.flatMap(x=>Option(x*10)))

    //for-comprehensions
    val config: Map[String,String] = Map(
      "host" -> "176.45.36.2",
      "port" -> "80"
    )

}
