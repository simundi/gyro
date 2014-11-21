package com.simundi.java8.ch04.defaultMethods;

/**
 * Created by simundi on 21/11/2014.
 */
public interface FastFly extends Fly{


    default void takeOff(){
        System.out.println("FastFly::takeOff");
    }

}
