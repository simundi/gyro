package com.simundi.java8.ch03.comparators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by simundi on 13/11/2014.
 */
public class ComparingObjects {

    private static final List<Person> people = Arrays.asList(
            new Person("John" , 20),
            new Person("Gareth" , 21),
            new Person("Masoud" , 24),
            new Person("Nadia" , 20),
            new Person("Greg" , 30),
            new Person("Jane" , 29)

    );



    public static void main(String[] args) {

        final List<Person> ascendingPeople = people
                .stream()
                .sorted((person1, person2) -> person1.ageDifference(person2))
                .collect(Collectors.toList());

        ascendingPeople.forEach(System.out::println);

        final List<Person> dascendingPeople = people
                .stream()
                .sorted((person1, person2) -> person2.ageDifference(person1))
                .collect(Collectors.toList());

        dascendingPeople.forEach(System.out::println);


    }
}
