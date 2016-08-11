package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Alexandre Simundi on 29/07/2016.
 */
public class ObjectStreamTest {


    public static void main(String[] args) {


        final List<Person> people = Arrays
            .asList(
                new Person("User A", 65),
                new Person("User B", 40),
                new Person("User C", 35),
                new Person("User D", 27),
                new Person("User E", 48)
            );


        people
            .stream()
            .filter( p -> p.getAge() < 40 )
            .sorted( (p1,p2) -> p1.getName().compareTo(p2.getName()))
            .forEach( System.out::println );

        final Map<Integer, List<Person>> peopleMap = people
            .stream()
            .collect(Collectors.groupingBy(p -> (int) p.getAge() / 10));
        System.out.println(peopleMap);

        final Optional<Person> option = people
            .stream()
            .reduce((p1, p2) -> p1.getAge() >= p2.getAge() ? p1 : p1);

        final Person person = option.get();
        option.ifPresent( p -> System.out.println("Oldest: " + p));



    }

    public static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }
    }




}
