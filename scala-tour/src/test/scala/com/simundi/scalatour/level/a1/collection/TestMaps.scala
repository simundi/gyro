package com.simundi.scalatour.level.a1.collection

import org.scalatest.FunSuite
import scala.collection.mutable.HashMap

class TestMaps extends FunSuite{
  
  test("Creating maps"){
    
    val v = Map(1 -> "C 1", 2 -> "C 2", 3 -> "C 3")
    
    assert (v(1) === "C 1")
    assert (v(2) === "C 2")
    assert (v(3) === "C 3")
  }
  
  
  test("Creating maps from a list"){
    
    val list = List(1,2,3,4,5,6,7,8,9)

    val map = new HashMap[String , Int]
    
    list.foreach( i => map.put("m_" +i , i) )
    
    assert(map("m_1") === 1)
    assert(map("m_2") === 2)
    assert(map("m_3") === 3)
    
  }

}