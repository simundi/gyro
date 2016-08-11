package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by simundi on 12/11/2014.
 */
public class InteratingThroughLIst {

    public static final List<String> friends = Arrays.asList("Sandro", "Thiago", "Nandinho", "Guto", "Guitierrez", "Baxinho", "Nego Jony");

    public static void main(String[] args) {


        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consumer interface: " + s);
            }
        });


        friends.forEach((final String name) -> System.out.println("Lambda: " + name));


        friends.forEach((name) -> System.out.println("Lambda (short): " + name));


        friends.forEach(name -> System.out.println("Lambda (no parentheses): " + name));

        System.out.println("Method reference====");
        friends.forEach(System.out::println);


    }

}
