package com.simundi.scalatour.level.a1.collection

import org.scalatest.FunSuite

class TestBasicCollections extends FunSuite{


  test("test List - duplicates values") {
    
    val list = List(1,2,3,4,5,5,5)
    
    assert(list === List(1,2,3,4,5,5,5))  
  }  

  
  test("test Set - duplicates values") {
	  val set = Set(1,2,3,4,5,5,5)
    
	  assert(set === Set(1,2,3,4,5))     
  }
  
  test("iterating Set") {
	  var set = Set(1,2,3,4,5,5,5)
			  
	  var str:String = "";
	  set.foreach( number => str += number + ":")
	  
	  assert (str === "5:1:2:3:4:")
	  
  }
  
  test("adding values Sets") {
	  //Those are immutable collections, you gimp!
	  var set = Set(1,3,5,7,9)
			  
	  set = set.+(2) //creates a new set with the new elements
	  set = set.+(4)
	  set = set.+(6)
	  set = set.+(8)
	  
	  assert (set === Set(1,2,3,4,5,6,7,8,9))
	  
  } 
  
  test("adding values mutable Sets") {
	  var seq = Seq(1,3,5,7,9,9)
			  
	  
	  assert (seq === Seq(1,3,5,7,9,9))
	  println("===> Class name: " + seq.getClass().getName())
	  
  }    
  
  
}