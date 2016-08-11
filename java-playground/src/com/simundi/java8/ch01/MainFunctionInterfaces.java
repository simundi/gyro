package com.simundi.java8.ch01;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Alexandre Simundi on 29/07/2016.
 */
public class MainFunctionInterfaces {


    Consumer<String> myConsumerFunction = System.out::println;

    Consumer<String> myConsumerFunction2 = str -> System.out.println(str);

    Predicate<String> isEmpty = String::isEmpty;

    Predicate<String> isNotEmpty = str -> str.trim().length() > 0;

    Supplier<Double> random = Math::random;

    Supplier<Integer> randomBetween1and10 = () -> (int) (Math.random() * 10);


}
