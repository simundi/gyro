package com.simundi.scalatour.level.a1.clojures

object ClojureExecutor {
  
  def execute( times:Int , func: (Int) => Unit ){
    for(i <- 0 until times){
      func(i)
    }
  }
  
  

}