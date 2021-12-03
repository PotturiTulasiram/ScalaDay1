package PatternMatching

object PatternMatchingExcercise extends App {
  trait Expr
  case class Number(n:Int) extends Expr
  case class Sum(e1:Expr,e2:Expr) extends Expr
  case class Product(e1:Expr,e2:Expr) extends Expr


  def show(e:Expr):String = e match {
    case Number(n) =>s"$n"
    case Sum(e1, e2) => show(e1)+"+"+show(e2)
    case Product(e1,e2) => {
      def mayBeParanthesis(exp:Expr) = exp match {
        case Product(_,_) => show(exp)
        case Number(_) => show(exp)
        case _=> "("+show(exp)+")"
      }
      mayBeParanthesis(e1)+"*"+mayBeParanthesis(e2)
    }
  }

  println(show(Sum(Number(2),Number(3))))
  println(show(Sum(Sum(Number(2),Number(3)),Number(4))))
  println(show(Product(Sum(Number(2),Number(3)),Number(3))))
  println(show(Sum(Product(Number(2),Number(3)),Number(1))))

}
