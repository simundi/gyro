package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite

class TestFilter extends FunSuite {
  
  test("Testing filtering pair numbers"){
    
    val list = List(1,2,3,4,5,6,7,8,9,10)
    
    val newList = list.filter( (i) => i % 2 ==0 )
    
    assert(newList === List(2,4,6,8,10))
    assert(list === List(1,2,3,4,5,6,7,8,9,10))
  }
  
  test("Testing filtering with generic function"){
    
    val list = List(1,2,3,4,5,6,7,8,9,10)
    
    def isEven(i:Int):Boolean = i % 2 ==0
    
    val newList = list.filter( isEven _ )
    
    assert(newList === List(2,4,6,8,10))
    assert(list === List(1,2,3,4,5,6,7,8,9,10))
  }  

}