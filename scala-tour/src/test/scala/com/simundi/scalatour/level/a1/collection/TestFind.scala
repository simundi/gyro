package com.simundi.scalatour.level.a1.collection
import org.scalatest.FunSuite
import com.simundi.scalatour.level.a1.oop.Person

/**
 * Finds the first element of the iterable collection satisfying a predicate, if any.
 *	Note: may not terminate for infinite-sized collections.
 *	Note: might return different results for different runs, unless the underlying collection type is ordered
 */
class TestFind extends FunSuite{
  
  /**
   * The funciton find will return a "Option", that represents (obviously) optional values.
   * 
   * So, even if the function doesn't find a result, it will not return "null" or an empty list.
   * 
   */
  test("Find person in a list"){
    
    val persons = List(new Person(23),new Person(17),new Person(20),new Person(25))
    
    val option:Option[Person] = persons.find( (p:Person) => p.age == 17 )
    
    assert (option.get.age === 17 )
    
  }
  
  test("No results found"){
    
    val persons = List(new Person(23),new Person(17),new Person(20),new Person(25))
    
    val option:Option[Person] = persons.find( (p:Person) => p.age < 17 )
    
    assert (option.isEmpty )
  } 

   
  test("Working smarter with no result was found"){
    
    val persons = List(new Person(23),new Person(17),new Person(20),new Person(25))
    
    val option:Option[Person] = persons.find( (p:Person) => p.age < 17 )
    
    assert (option.getOrElse(persons(1)).age  === 17)  
    assert ((option getOrElse persons(1) ).age  === 17) //that's the same line as above, but with lest '('  
  }  

}