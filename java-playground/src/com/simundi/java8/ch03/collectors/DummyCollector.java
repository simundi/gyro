package com.simundi.java8.ch03.collectors;

import com.simundi.java8.ch03.comparators.Person;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by simundi on 20/11/2014.
 */
public class DummyCollector implements Collector<Person , List<Person>, String> {


    @Override
    public Supplier<List<Person>> supplier() {
        return null;
    }

    @Override
    public BiConsumer<List<Person>, Person> accumulator() {
        return null;
    }

    @Override
    public BinaryOperator<List<Person>> combiner() {
        return null;
    }

    @Override
    public Function<List<Person>, String> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}
