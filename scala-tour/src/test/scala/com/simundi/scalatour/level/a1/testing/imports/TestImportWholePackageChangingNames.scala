package com.simundi.scalatour.level.a1.testing.imports

import org.scalatest.FunSuite
import com.sun.org.apache.bcel.internal.classfile.ConstantObject
import com.simundi.scalatour.level.a1.imports.{
  ConstantsObject => Object1, 
  ClassToImport => Class1, 
  AnotherObjectToImport => Object2
}

class TestImportWholePackageChangingNames extends FunSuite{

  test("Object Import changing name"){
    assert( Object1.methodTest === "Hello Import!!" )
  }
  
  test("Class Import changing name"){
    assert( new Class1().anotherMethodWithBody === "Will it be returned???? yes motherfucker!!" )
  }

  test("Import another object changing name"){
    assert( Object2.attributeTest === "Hell yeah.." )
  }  
  
}