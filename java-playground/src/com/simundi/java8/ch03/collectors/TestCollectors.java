package com.simundi.java8.ch03.collectors;

import com.simundi.java8.ch03.comparators.Person;

import java.util.*;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.*;

/**
 * Created by simundi on 15/11/2014.
 */
public class TestCollectors {

    private static final List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Gareth", 21),
            new Person("Masoud", 24),
            new Person("Nadia", 20),
            new Person("Greg", 30),
            new Person("Jane", 29)
    );

    public static void main(String[] args) {

        final ArrayList<Object> collectedPerson = people
                .stream()
                .filter(person -> person.getAge() > 20)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("Test 001: " + collectedPerson);

        final Map<Integer, List<Person>> groupedByAge = people
                .stream()
                .filter(person -> person.getAge() > 20)
                .collect(groupingBy(Person::getAge));

        System.out.println("Grouped By Age: " + groupedByAge);

        final Map<String, List<Person>> byFirstLetter = people
                .stream()
                .filter(person -> person.getAge() > 20)
                .collect(groupingBy(person -> person.getName().substring(0, 1)));

        System.out.println("Grouped By First Letter: " + byFirstLetter);


        final Map<Integer, List<String>> nameByAge = people
                .stream()
                .filter(person -> person.getAge() >= 20)
                .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));

        System.out.println("Names Grouped by Age: " + nameByAge);

        final Comparator<Person> byAge = Comparator.comparing(Person::getAge);

        final Map<Character, Optional<Person>> olderPersonOfEachLetter = people
                .stream()
                .collect(
                        groupingBy(
                                person -> person.getName().charAt(0),
                                reducing(BinaryOperator.maxBy(byAge))
                        )
                );

        System.out.println("Oldest Person for each letter: " + olderPersonOfEachLetter);


    }
}
