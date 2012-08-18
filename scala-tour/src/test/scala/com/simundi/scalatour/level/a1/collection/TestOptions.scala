package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite

class TestOptions extends FunSuite{
  
  test("get non defined obj"){
    
    var opt:Option[Integer] = None
    
    assert (opt.isDefined === false)
    assert (opt.isEmpty === true)
    
    assert( opt.getOrElse() === ())
    assert( opt.getOrElse(2) === 2)
    
  }
  
  test("get defined obj"){
    
    var opt:Option[String] = Some("test")
    
    assert (opt.isDefined === true)
    assert (opt.isEmpty === false)
    
    assert( opt.get === "test")
    
  } 
  
  test("Iterating t get the value"){
    
    var opt:Option[String] = Some("test")
    
    opt foreach ( value => assert(value === "test") )
    	
  }    
  
  test("Using pattern matching to get the value"){
    
    var opt:Option[String] = Some("test")
    
    opt match{
      case Some("test") => assert(opt.get ==="test")
      case _ => fail()
    }
    	
  }  
  

}