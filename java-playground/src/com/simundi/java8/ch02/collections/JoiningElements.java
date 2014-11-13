package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by simundi on 12/11/2014.
 */
public class JoiningElements {

    public static final List<String> friends = Arrays.asList("Sandro", "Thiago", "Nandinho", "Guto", "Guitierrez", "Baxinho", "Nego Jony");



    public static void main(String[] args) {
        System.out.println("String.join(): " + String.join(", " , friends));


        final String collected = friends
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println("Collectors: " + collected);


    }


}
