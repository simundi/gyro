

object Loops{

  /**
   * Using 'until'
   */
  def contactWithComma(args:Array[String]):String = {
    var concatenatedArray = ""
    
    for (i <- 0 until args.length) {
      concatenatedArray += (args(i) + ",")
    }
    
    concatenatedArray
    
  }

  /**
   * Using TO 
   */
  def contactWithSpace(args:Array[String]):String = {
    var concatenatedArray = ""
    
    for (i <- 0 to 3 ) {
    	concatenatedArray += (args(i) + " ")
    }
    
    
    concatenatedArray
   }
    
}