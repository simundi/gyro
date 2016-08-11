package com.simundi.java8.ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Alexandre Simundi on 29/07/2016.
 */
public class StreamsTest {


    public static void main(String[] args) {


        final List<String> cities = Arrays
            .asList("Santiago", "London", "New York", "Porto Alegre", "Madrid", "Rome", "São Paulo");


        cities
            .stream()
            .filter( str -> str.contains("e") )
            .sorted(Comparator.reverseOrder())
            .map( str -> str.toUpperCase() )
            .forEach( System.out::println );




        final List<String> numbers = Arrays
            .asList("1,2,3,4,5", "1,2,3,4,5", "1,2,3,4,5", "1,2,3,4,5", "1,2,3,4,5", "1,2,3,4,5", "1,2,3,4,5");

        numbers
            .stream()
            .flatMap(str -> Stream.of(str.split(",")))
            .sorted()
            .forEach(s -> System.out.print(s + " "));



        final Map<String, List<String>> collect = numbers
            .stream()
            .flatMap(str -> Stream.of(str.split(",")))
            .collect(Collectors.groupingBy(x -> x));

        System.out.println(collect);

    }




}
