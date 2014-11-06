package com.simundi.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FunctionalSyntax {

    private static Collection<String> friends = Arrays.asList("Thaigo" , "Sandro", "Baixinho", "Michael" , "Jonathan", "Munhoz" , "Nandinho" , "Guto" , "Gutierrez");

    private static Consumer<String> sysout = name -> System.out.println(name);

    private static Predicate<String> validNames = (final String name) -> name.length() >= 6;


    /**
     * method that returns a predicate/function to filter names
     */
    private static Predicate<String> checkStartingLetter(String letter) {
        return name -> name.startsWith(letter);
    }

    public static void main(String[] args) {

        System.out.println("=== Consumer Interface ===");
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println("=== Lambda Interfaces ===");
        friends.forEach((name) -> System.out.println("(1) " + name));
        friends.forEach((final String name) -> System.out.println("(2) " + name));
        friends.forEach(System.out::println);

        System.out.println("=== Transforming LIst ===");
        friends
                .stream()
                .map( name -> name.toUpperCase())
                .forEach(sysout);

        System.out.println("=== Filtering List by Name size ===");

        System.out.println("\t Original size: " + friends.size());

        System.out.println("\t Filtered sie:" +
                        friends
                                .stream()
                                .filter(validNames) //Using Predicates
                                .count()
        );

        System.out.println("=== Filtering List by Starting Letter ===");


        System.out.println("\t Starting with Lettet B:" +
                friends
                        .stream()
                        .filter(checkStartingLetter("B"))
                        .collect(toList())
        );

        System.out.println("\t Starting with Lettet M (joining):" +
                        friends
                                .stream()
                                .filter(checkStartingLetter("M"))
                                .collect(joining(", "))
        );

    }
}
