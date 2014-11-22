package com.simundi.java8.ch07.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by simundi on 22/11/2014.
 */
public class Memoizer {


    /**
     * ComputeIfAbasent is awesome!!
     * 
     * https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#computeIfAbsent-K-java.util.function.Function-
     *
     * @return
     */
    public static <T , R> R callMemoized(
            final BiFunction<Function<T, R> , T, R> maxProfitComputation, final T rodLength
    ){
        Function<T, R> memoized = new Function<T, R>() {

            private final Map<T , R> storage = new HashMap();
            @Override
            public R apply(final T input) {
                return storage.computeIfAbsent(input, key -> maxProfitComputation.apply(this, key));
            }
        };

        return memoized.apply(rodLength);
    }
}
