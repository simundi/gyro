package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite

class TestYield extends FunSuite{
  
  test("Test yield"){
    
    val v = for(i <- 0 to 5) yield i
    
    assert( v === Vector(0,1,2,3,4,5) )
    
  }
 
  test("Test yield odds number"){
    val v = for(i <- 0 to 5 if i % 2 != 0) yield i
    
    assert( v === Vector(1,3,5) )
  }  

  
}