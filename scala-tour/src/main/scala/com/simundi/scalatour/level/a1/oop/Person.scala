package com.simundi.scalatour.level.a1.oop

/**
 * Defining Person attributes within the class declaration. 
 * 
 * it'll create a constructor using all the parameters defined.
 * 
 *  
 *  
 */
class Person (var name:String, var age:Integer, var height:Float, var weight:Float){

	def this() = this(null , null , 0.0f, 0.0f)
  
    override def toString() = {
        "name= " + name + "\n" +
        "age= " + age + "\n" +
        "Height " + height + "\n" +
        "Weight " + weight + "\n" 
    
    }
    




}