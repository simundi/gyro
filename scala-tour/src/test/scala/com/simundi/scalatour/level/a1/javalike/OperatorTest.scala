package com.simundi.scalatour.level.a1.javalike
import org.scalatest.FunSuite

class CalculatorTest extends FunSuite{

  var calculator:Calculator = new Calculator
  
  test("Test SUBTRACT"){
     val result = calculator
     .value(10)
     .minus(15)
     .result()
     
    assert (result === -5)  
  }

  test("Test DIVIDE"){
     val result = calculator
     .value(10)
     .divide(2)
     .result()
     
    assert (result === 5)  
  } 

  test("Test MULTIPLY"){
     val result = calculator
     .value(3)
     .times(3)
     .result()
     
    assert (result === 9) 
  }

  test("Test SUM"){      
     val result = calculator
     .value(3)
     .plus(3)
     .result()
     
    assert (result === 6)   
  }

}
