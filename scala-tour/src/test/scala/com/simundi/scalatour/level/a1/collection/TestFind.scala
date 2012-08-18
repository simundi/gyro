package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite
import com.simundi.scalatour.level.a1.oop.Person

class TestFind extends FunSuite{
  
  
  test("Find person in a list"){
    
    val persons = List(new Person(23),new Person(17),new Person(20),new Person(25))
    
    val option:Option[Person] = persons.find( (p:Person) => p.age == 17 )
    
    assert (option.get.age === 17 )
    
  }

}