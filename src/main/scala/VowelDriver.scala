object VowelDriver extends App{
  def vowelCount(str: String): Int = {
    
    val array : Array[Int] = new Array(1)
    for (indexPosition <- 0 until str.length)
      if(str(indexPosition) =='a' || str(indexPosition)=='e' || str(indexPosition)=='i'||str(indexPosition)=='o'|| str(indexPosition)=='u' ||str(indexPosition) =='A' || str(indexPosition)=='E' || str(indexPosition)=='I'||str(indexPosition)=='O'|| str(indexPosition)=='U') array(0) = array(0) + ((indexPosition + 1) * (str.length - indexPosition))

    array(0)
  }

  // println("Enter String")
//   val string1=scala.io.StdIn.readLine()
//   val result=vowelCount(string1)
//   println(s"Total Number of vowels are $result")
  
  
  val string1="Hello"
  val result=vowelCount(string1)
  println(s"Total Number of vowels are $result")
    
}


