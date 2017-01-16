/**
  * Created by shreyansh on 15/1/17.
  */
object Factorial {

  def factorecursively(x:Int): BigInt ={

    if (x >= 1) {
      return x * factorecursively(x - 1)
    }
    else{
      return 1
    }
  }

  def main(args: Array[String]) {

    if(args.length == 0){
      println("command-line parameter is missing")
      System.exit(1)
    }
    //Convert string to integer to pass it in function
    var n = args(0).toInt
    var ex = new ExceptionExample()
    var ch = 0
    try{
      ex.checkInputRange(n)
      do{
        println("1. Iteratively\n2. Recursively\n3. Exit")
        ch=scala.io.StdIn.readInt()
        if(ch==1){
          println("Iterative Method")
          var ans: BigInt = 1 //for very large values
          for (a <- 1 to n) {
            ans = ans * a
          }
          println(s"Iteratively Answer is $ans")
        }
        else if(ch==2){
          println("Recursive Method (Bonus)")
          var ans = factorecursively(n)
          println(s"Recursively Answer is $ans")
        }
        else if(ch==3){
          println("Exit")
        }
        else{
          println("Invalid choice")
        }
      }while(ch!=3)
    }
    catch{
      case e : Exception => println("FactorialInputOutOfRange : "+e)
    }

  }
}
class FactorialInputOutOfRange(str:String) extends Exception(str){}
class ExceptionExample{
  @throws(classOf[FactorialInputOutOfRange])
  def checkInputRange(num:Int){
    if(num<1 || num>100){
      throw new FactorialInputOutOfRange("Invalid input")
    }
  }
}