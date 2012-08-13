package com.simundi.scalatour.level.a1.collection

import org.scalatest.FunSuite
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

class TestTuples extends FunSuite{

  test("creating Tuples") {
	  val tuple = ("localhost" , 80, "/test")
    
	  assert (tuple._1 === "localhost")     
	  assert (tuple._2 === 80)     
	  assert (tuple._3 === "/test")     
  }
  
  test("interating Tuples") {
	  val tuple = ("localhost" , 80, "/test")
    
	  var str:String = ""
	  tuple.productIterator.foreach( i =>  str += i + ", " )
	  
	  assert (str === "localhost, 80, /test, ")
  } 
  
  test("Tuples with patter matching") {
	  assert ("production"       === Environment("localhost" , 80, "/test") )
	  assert ("production slave" === Environment("localhost" , 88, "/test") )
	  assert ("production slave" === Environment( "bla bla" , 88, null) )
  }  
  
}