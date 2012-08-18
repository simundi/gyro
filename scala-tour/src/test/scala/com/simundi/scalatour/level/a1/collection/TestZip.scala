package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite

class TestZip extends FunSuite {

  test("Aggregating two lists "){
    
    
    val clientIds = List(1,2,3,4,5,6)
    val clientNames = List("name A","name B","name C","name D","name E","name F")
    
    
    val clients = clientIds zip clientNames
    
    
    assert( clients(0) === (1 , "name A") )
    
    assert( clients(5) === (6 , "name F") )
    
  }
  
 test("Aggregating two lists with differents sizes"){
    
    
    val clientIds = List(1,2,3)
    val clientNames = List("name A","name B","name C","name D","name E","name F")
    
    
    val clients = clientIds zip clientNames
    
    
    assert( clients(0) === (1 , "name A") )
    
    assert( clients(2) === (3 , "name C") )
    
    assert (clients.size === 3)    
  }  
  
  
 test("Aggregating two lists with differents sizes (2)"){
    
    
    val clientIds = List(1,2,3,4,5,6)
    val clientNames = List("name A","name B")
    
    
    val clients = clientIds zip clientNames
    
    
    assert( clients(0) === (1 , "name A") )
    
    assert (clients.size === 2)    
  }  
 
}