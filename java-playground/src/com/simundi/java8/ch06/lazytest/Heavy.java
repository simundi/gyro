package com.simundi.java8.ch06.lazytest;

/**
 * Created by simundi on 21/11/2014.
 */
public class Heavy {

    public Heavy() {
        System.out.println("*New Heavy Created*");
    }

    @Override
    public String toString() {
        return "Heavy{toString}";
    }
}
