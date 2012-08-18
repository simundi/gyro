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

	/*Auxiliary constructor*/
	def this() = this(null , null , 0.0f, 0.0f)
	def this(age:Integer) = this(null , age , 0.0f, 0.0f)
	def this(name:String) = {
		this(name , 18 , 1.75f, 75.0f)
		println("constructor only with name was invoked")
	}
	
	println("Instantiating class Person")
	println("The body of the class is the construtor method body. here you can do whatever you want in the class instatiation")
  
	
    override def toString() = {
        "name= " + name + "\n" +
        "age= " + age + "\n" +
        "Height " + height + "\n" +
        "Weight " + weight + "\n" 
    
    }
    




}