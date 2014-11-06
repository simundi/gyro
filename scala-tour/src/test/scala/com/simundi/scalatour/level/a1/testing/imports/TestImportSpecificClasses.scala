package com.simundi.scalatour.level.a1.testing.imports

import org.scalatest.FunSuite
import com.simundi.scalatour.level.a1.imports.{ClassToImport, AnotherObjectToImport}
import com.simundi.scalatour.level.a1.imports.ConstantsObject._

class TestImportSpecificClasses extends FunSuite{

  test("Object Import"){
    assert( methodTest === "Hello Import!!" )
  }
  
  test("Class Import"){
    assert( new ClassToImport().anotherMethodWithBody === "Will it be returned???? yes motherfucker!!" )
  }
 
  test("Import another object"){
    assert( AnotherObjectToImport.attributeTest === "Hell yeah.." )
  }   
  
}