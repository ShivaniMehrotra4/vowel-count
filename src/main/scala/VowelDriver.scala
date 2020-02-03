object VowelDriver extends App{
  def vowelCount(str: String): Int = {
    
    val array : Array[Int] = new Array(1)
    for (indexPosition <- 0 until str.length)
      if(str(indexPosition) =='a' || str(indexPosition)=='e' || str(indexPosition)=='i'||str(indexPosition)=='o'|| str(indexPosition)=='u' ||str(indexPosition) =='A' || str(indexPosition)=='E' || str(indexPosition)=='I'||str(indexPosition)=='O'|| str(indexPosition)=='U') array(0) = array(0) + ((indexPosition + 1) * (str.length - indexPosition))

    array(0)
  }

  val result1: Int = vowelCount("baceb")
  val result2: Int = vowelCount("aAa")
  val result3: Int = vowelCount("aced")
  println(result1)
  println(result2)
  println(result3)

}


