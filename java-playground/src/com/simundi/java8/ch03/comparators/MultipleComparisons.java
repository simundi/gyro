package com.simundi.java8.ch03.comparators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

/**
 * Created by simundi on 14/11/2014.
 */
public class MultipleComparisons {

    private static final List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Gareth", 21),
            new Person("Masoud", 24),
            new Person("Nadia", 20),
            new Person("Greg", 30),
            new Person("Jane", 29)
    );

    static final Function<Person, String> byName = person -> person.getName();
    static final Function<Person, Integer> byAge = person -> person.getAge();

    public static void main(String[] args) {
        System.out.println("byName: ");
        people
                .stream()
                .sorted(comparing(byName))
                .forEach(System.out::println);

        System.out.println("\nbyAge and byName: ");
        people
                .stream()
                .sorted(
                        comparing(byAge)
                                .thenComparing(byName).reversed()
                )
                .forEach(System.out::println);

    }

}
