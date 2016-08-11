package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by simundi on 12/11/2014.
 */
public class PickingUpElement {

    public static final List<String> friends = Arrays.asList("Sandro", "Thiago", "Nandinho", "Guto", "Guitierrez", "Baxinho", "Nego Jony");

    public static void main(String[] args) {

        final Optional<String> foundName = friends
                .stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        System.out.format("Name found with letter A: %s%n", foundName.orElse("name not found"));

        final long count = friends
            .stream()
            .filter(name -> name.startsWith("A"))
            .count();


        //Map to Int
        System.out.format("Total number of characters: %s%n",
                friends
                        .stream()
                        .mapToInt(name -> name.length())
                        .sum()
        );

        //Pick Up Longest name
        final Optional<String> longestName = friends
                .stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

        longestName.ifPresent( (String name) -> System.out.println("Longest Name: " + name));


    }

}
