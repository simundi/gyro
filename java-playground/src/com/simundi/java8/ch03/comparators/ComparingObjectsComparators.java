package com.simundi.java8.ch03.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by simundi on 13/11/2014.
 */
public class ComparingObjectsComparators {

    private static final List<Person> people = Arrays.asList(
            new Person("John" , 20),
            new Person("Gareth" , 21),
            new Person("Masoud" , 24),
            new Person("Nadia" , 20),
            new Person("Greg" , 30),
            new Person("Jane" , 29)
    );



    public static void main(String[] args) {

        Comparator<Person> ascending = (final Person person1 ,final Person person2) -> person1.ageDifference(person2);
        Comparator<Person> descending = ascending.reversed();
        Comparator<Person> byName = (person1,person2) -> person1.getName().compareTo(person2.getName());

        System.out.print("Ascending: ");
        people.stream().sorted(ascending).forEach(System.out::println);

        System.out.print("\nDescending: ");
        people.stream().sorted(descending).forEach(System.out::println);

        System.out.print("\nBy Name: ");
        people.stream().sorted(byName).forEach(System.out::println);

        System.out.print("\nYougest Person: ");
        people.stream()
                .min(Person::ageDifference)
                .ifPresent( person -> System.out.println("Yougest : " + person));

        System.out.print("\nOldest Person: ");
        people.stream()
                .max(Person::ageDifference)
                .ifPresent( person -> System.out.println("Yougest : " + person));



    }
}
