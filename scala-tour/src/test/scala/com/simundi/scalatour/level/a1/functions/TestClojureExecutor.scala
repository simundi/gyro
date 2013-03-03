package com.simundi.scalatour.level.a1.functions

import org.scalatest.FunSuite
import com.simundi.scalatour.level.a1.clojures.ClojureExecutor


class TestSimpleClojures extends FunSuite{
  
  test("Test simple cloujures"){
    
    ClojureExecutor.execute( 3 , (i:Int) => println("Test " + i) )
    
  }

}