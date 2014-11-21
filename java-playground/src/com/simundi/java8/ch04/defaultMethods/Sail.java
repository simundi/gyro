package com.simundi.java8.ch04.defaultMethods;

/**
 * Created by simundi on 21/11/2014.
 */
public interface Sail {


    default void turn() { System.out.println("Sail::turn"); }

    default void cruise() { System.out.println("Sail::cruise"); }
}
