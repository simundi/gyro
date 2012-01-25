

object Loops{

  def contactWithComma(args:Array[String]):String = {
    var concatenatedArray = ""
    
    for (i <- 0 until args.length) {
      concatenatedArray += (args(i) + ",")
    }
    
    concatenatedArray
    
  }

  def contactWithSpace(args:Array[String]):String = {
    var concatenatedArray = ""
    
    for i in 0 .. 3 {
      concatenatedArray += (args(i) + ",")
    }
    
    concatenatedArray
    
  }
    
}