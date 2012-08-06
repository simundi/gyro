package com.simundi.scalatour.level.a1.testing.imports

import org.scalatest.FunSuite
import com.simundi.scalatour.level.a1.imports.{ClassToImport, AnotherObjectToImport}

class TestImportSpecificClasses extends FunSuite{

  /* it'll give a compilation error because ConstantsObject isn't being imported.
  test("Object Import"){
    assert( ConstantsObject.methodTest === "Hello Import!!" )
  }
  */
  
  test("Class Import"){
    assert( new ClassToImport().anotherMethodWithBody === "Will it be returned???? yes motherfucker!!" )
  }
 
  test("Import another object"){
    assert( AnotherObjectToImport.attributeTest === "Hell yeah.." )
  }   
  
}