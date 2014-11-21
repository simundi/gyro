package com.simundi.java8.ch04.defaultMethods;

/**
 * Created by simundi on 21/11/2014.
 */
public interface Fly {


    default void takeOff() { System.out.println("Fly::takeOff"); }

    default void land() { System.out.println("Fly::land"); }

    default void turn() { System.out.println("Fly::turn"); }

    default void cruise() { System.out.println("Fly::cruise"); }
}
