package com.simundi.scalatour.level.a1.testing.imports

import org.scalatest.FunSuite
import com.simundi.scalatour.level.a1.imports._
import com.sun.org.apache.bcel.internal.classfile.ConstantObject

class TestImportWholePackage extends FunSuite{

  test("Object Import"){
    assert( ConstantsObject.methodTest === "Hello Import!!" )
  }
  
  test("Class Import"){
    assert( new ClassToImport().anotherMethodWithBody === "Will it be returned???? yes motherfucker!!" )
  }

  test("Import another object"){
    assert( AnotherObjectToImport.attributeTest === "Hell yeah.." )
  }  
  
}