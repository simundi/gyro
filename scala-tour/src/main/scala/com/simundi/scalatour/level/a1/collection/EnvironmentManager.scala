package com.simundi.scalatour.level.a1.collection

object Environment {
  
  def apply (tuple:(String, Int, String)):String = {
	  tuple match{
	    case ( "localhost" , 80 , "/test") => "production"	    
	    case ( _ , 88 , _) => "production slave"
	  }    
  }

}