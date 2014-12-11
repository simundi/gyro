package com.simundi.java8.performance.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static com.simundi.java8.performance.comparators.TextDao.getArray;

/**
 * Created by simundi on 11/12/2014.
 */
public class TestComparisons {


    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Round #" + i);

            System.out.printf("\tLambda comparison: \t\t%s\n", lambdaComparison());
            System.out.printf("\tNormal comparison: \t\t%s\n", normalComparison());
            System.out.printf("\tStream comparison: \t\t%s\n", streamComparison());
        }

    }

    private static long normalComparison() {

        final String[] text = getArray();
        final long start = System.nanoTime();
        Arrays.sort(text, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        final long stop = System.nanoTime();
        return stop - start;
    }

    private static long lambdaComparison() {
        final String[] text = getArray();
        final long start = System.nanoTime();
        Arrays.sort(text, (String o1, String o2) -> o1.compareTo(o2));
        final long stop = System.nanoTime();
        return stop - start;
    }

    private static long streamComparison() {
        final String[] text = getArray();
        final long start = System.nanoTime();
        Stream.of(text).sorted((String o1, String o2) -> o1.compareTo(o2)).toArray();
        final long stop = System.nanoTime();
        return stop - start;
    }


}
