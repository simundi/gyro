package com.simundi.scalatour.level.a1.infix
import org.scalatest.FunSuite

/**
 * "Any method which takes a single parameter can be used as an infix operator in Scala."
 */
class TestInfix extends FunSuite{

  test("Test sum"){
    
    val calc = new Calculator()
    
    calc + 1 + 1 + 1
    
    assert(calc.currentValue === 3)
  }
  
 test("Test multiply"){
    
    val calc = new Calculator(10)
    
    calc * 2 + 1 - 2
    
    assert(calc.currentValue === 19)
  }  
  
}