package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by simundi on 12/11/2014.
 */
public class ReusingLambdas {

    public static final List<String> friends = Arrays.asList("Sandro", "Thiago", "Nandinho", "Guto", "Guitierrez", "Baxinho", "Nego Jony");


    //Function that will create a new Predicate based on the argument passsed in.
    public static final Function<String, Predicate<String> > filteringFirstLetter = (final String letter) -> {
        return (final String name) -> name.startsWith(letter);
    };

    //Same example as above, but less code
    public static final Function<String, Predicate<String> > filteringFirstLetter2 = (final String letter) ->
            (final String name) -> name.startsWith(letter);


    public static void main(String[] args) {

        final Predicate<String> filterWithG = (String name) -> name.startsWith("G");

        System.out.println("Filtering Using predicate: " + friends
                .stream()
                .filter(filterWithG)
                .count() );

        System.out.println("Filtering Using Function/predicate: " + friends
                .stream()
                .filter(filteringFirstLetter.apply("A"))
                .count() );





    }


}
