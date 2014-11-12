package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by simundi on 12/11/2014.
 */
public class TransformingList {

    public static final List<String> friends = Arrays.asList("Sandro", "Thiago", "Nandinho", "Guto", "Guitierrez", "Baxinho", "Nego Jony");

    public static void main(String[] args) {

        friends
                .stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.format("%s " , name));



    }

}
