package com.simundi.scalatour.level.a1.javalike



class Calculator{
 
  var value:Float = 0 
   
    def divide(val1:Int , val2:Int):Float ={
      val1 / val2
  }
  
  def multiply(val1:Int , val2:Int):Int ={
    val1 * val2
  }
  
  def value(value:Float):Calculator = {
    this.value = value
    this
  }
  
  def plus(valueToSum:Float):Calculator = {
    value = value + valueToSum  
    this 
  }

  def minus(valueToSubtract:Float):Calculator = {
    value = value - valueToSubtract  
    this
  }     

  def divide(valueToDivide:Float):Calculator = {
    value = value / valueToDivide  
    this
  }  

  def times(valueToMultiply:Float):Calculator = {
    value = value * valueToMultiply
    this
  } 
  
  def result():Float = {
    value
  }    
  
}





