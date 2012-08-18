package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite

class TestPartition extends FunSuite{

  test("Partition tests"){
    
    val list = List(1,2,3,4,5,6,7,8,9,10)
    
    val partionedlist = list.partition((i) => i <= 5)
    
    
    assert (partionedlist._1 === List(1,2,3,4,5) )
    assert (partionedlist._2 === List(6,7,8,9,10) )
    
  }
  
  
}