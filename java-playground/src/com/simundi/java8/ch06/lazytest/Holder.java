package com.simundi.java8.ch06.lazytest;

import java.util.function.Supplier;

/**
 * Created by simundi on 21/11/2014.
 */
public class Holder {

    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

    public Holder() {

    }

    public Heavy getHeavy() {
        return heavy.get();
    }

    private synchronized Heavy createAndCacheHeavy() {
        System.out.println(">> Calling Synchronized method");
        class HeavyFactory implements Supplier<Heavy>{
            private final Heavy heavyInstance = new Heavy();
            @Override
            public Heavy get() {
                System.out.println("*Not synchronized method* HeavyFactory -> heavyInstance");
                return heavyInstance;
            }
        }

        System.out.println("Heavy instance is: " + heavy.getClass());
        if(!HeavyFactory.class.isInstance(heavy)){
            System.out.println("createAndCacheHeav -> assigning Heavy Fatory");

            // At this point the lambda ()->() -> createAndCacheHeavy() will be replaced to a this HeavyFactory class
            //and because of that the the synchronized method won' be called anymore!!!
            heavy = new HeavyFactory();
        }


        return heavy.get();
    }


    public static void main(String[] args) {

        final Holder holder = new Holder();


        holder.getHeavy();
        holder.getHeavy();
        holder.getHeavy();
        holder.getHeavy();

    }

}
