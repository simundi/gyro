package com.simundi.java8.ch04.defaultMethods;

/**
 * Created by simundi on 21/11/2014.
 */
public class SeaPlane extends Vehicle implements FastFly, Sail {

    final private int altitude;

    public SeaPlane(int altitude) {
        this.altitude = altitude;
    }

    /**
     * Forced to be implemented due conflict in the interfaces Sail and FastFly(extending from Fly)
     */
    @Override
    public void cruise() {
        System.out.println("SeaPlane::cruise");
        if(altitude > 0)
            //Have to use super to tell the compiler call the default implementation, not a static method in the interface
            FastFly.super.cruise();
        else
            Sail.super.cruise();
    }


    public static void main(String[] args) {
        final SeaPlane seaPlane = new SeaPlane(1);
        seaPlane.takeOff();
        seaPlane.turn(); //No conflicts. Method in the class takes precedence
        seaPlane.cruise();
        seaPlane.land();
    }
}
