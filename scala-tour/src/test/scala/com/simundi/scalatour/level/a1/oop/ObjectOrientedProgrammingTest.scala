package com.simundi.scalatour.level.a1.oop

import org.scalatest.FunSuite

class ObjectOrientedProgrammingTest extends FunSuite{


    test("Test new  class"){
            
        var p:Person = new Person
        p.name = "Alex"
        p.age = 26
        p.height = 1.83f
        p.weight = 110
        
        println(p)       
    
    }
    
    test("Test CONSTRUCTORS"){
            
        var p:Person = new Person
        p.age = 26
        p.height = 1.83f
        p.weight = 110
        
        println(p)       
    
    }    


}