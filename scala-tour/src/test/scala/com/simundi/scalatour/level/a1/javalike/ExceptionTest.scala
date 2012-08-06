package com.simundi.scalatour.level.a1.javalike

import org.scalatest.FunSuite

class ExceptionTest extends FunSuite{
  
  test("Catching runtime exception"){
    
    try {
    	ExceptionThrower.throwRuntimeException;
    } catch{
      case e:RuntimeException => assert(true) 
      case e => assert(false, "Unkown exception thrown " + e)
    }
  }
  
  test("Catching Checked exception"){
    
    try {
    	ExceptionThrower.throwCheckedException;
    } catch{
      case e:RuntimeException => assert(false) 
      case e => assert(true)
    }
  } 
  
  
  test("Matching exceptions with conditionals"){
    
    val message1 = true;
    val message2 = false;
    
    try {
    	ExceptionThrower.throwRuntimeException;
    } catch{
      case e if(message2) => assert(false, "Message 2 was called") //it ignores the conditional when there is only one case
      case e if(message1) => assert(true)
    }
  }    
  

}