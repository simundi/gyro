

object Loops{

  /**
   * Using 'until'
   * 'until' excludes the last value in the range. 
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
   * 'TO'includes the last value in the range. Equivalent of "<="
   */
  def contactWithSpace(args:Array[String]):String = {
    var concatenatedArray = ""
    
    for (i <- 0 to 3 ) {
    	concatenatedArray += (args(i) + " ")
    }
    
    
    concatenatedArray
   }
    
}