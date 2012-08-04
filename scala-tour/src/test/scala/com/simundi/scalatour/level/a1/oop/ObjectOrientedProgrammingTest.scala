package com.simundi.scalatour.level.a1.oop

import org.scalatest.FunSuite

class ObjectOrientedProgrammingTest extends FunSuite{


    test("Test new  class like java"){
            
        var p:Person = new Person ("Alex", 27 ,1.83f, 96)
        
        assert(p.name === "Alex")
        assert(p.age === 27)
        assert(p.height === 1.83f)
        assert(p.weight === 96)
    }
    
    test("Test CONSTRUCTORS"){
            
        var p = new Person
        p.name = "Alex"
        p.age = 27
        p.height = 1.83f
        p.weight = 96
        
        assert(p.name === "Alex")
        assert(p.age === 27)
        assert(p.height === 1.83f)
        assert(p.weight === 96)         
    
    }
    
    test("Test Construct sub class"){
            
        var p:Person = new Employee ("Alex", 27 ,1.83f, 96)
        
        
        
        assert(p.name === "Alex")
        assert(p.age === 27)
        assert(p.height === 1.83f)
        assert(p.weight === 96)         
    
    }  

}