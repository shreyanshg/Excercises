/**
  * Created by shreyansh on 15/1/17.
  */
object Constructors_Ex{
def main(args: Array[String]): Unit = {
  var s1 = new InnoString("ShreyanshInno","Shreyansh")
  println(s1)
  println(s1.concat_normal("Gupta"))
  println(s1 + ("Gupta"))
  println(s1==new InnoString("Gupta"))
  println(s1.isPalindrome())
}
}
class InnoString(str:String){

  private var s: String = ""
  //Constructor
  def this(inp_str:String, str2:String)={
    this(inp_str)
    this.s = str2
  }
  def concat_normal(str_conc1:String):String ={
    s=s+str_conc1
    return s
  }
  def +(str_conc2:InnoString) = {
    s=s+str_conc2.s
  }
  def ==(str_conc3:InnoString):Boolean = {
    if(this.str == str_conc3)
      return true
    else
      return false
  }
  def isPalindrome():String = {
    val len = s.length
    for (i <- 0 until len / 2) {
      if (s(i) != s(len - i - 1))
        return "It is not a Palindrome"
    }
    return "It is a Palindrome"
  }
  override def toString: String = {
    return "Method String = %s, Private String = %s".format(str, s)
  }
  //  def getName(): String ={
  //    return s
  //  }
  //  def setName(x:String): Unit ={
  //    s=x
  //  }

}
