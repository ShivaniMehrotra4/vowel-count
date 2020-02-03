def vowelCount(str: String): Int = {
//  val innerLoop : Int =0
  val array :Array[Int]=new Array(1)
  for (innerLoop <- 0 until str.length) {
    if(str(innerLoop) =='a' || str(innerLoop)=='e' || str(innerLoop)=='i'||str(innerLoop)=='o'|| str(innerLoop)=='u')
      {
          array(0) = array(0)+ ((innerLoop+1) *(str.length - innerLoop))
      }

  }
  array(0)
}


vowelCount("abe")