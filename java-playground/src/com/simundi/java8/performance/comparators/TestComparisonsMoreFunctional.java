package com.simundi.java8.performance.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.simundi.java8.performance.comparators.TextDao.getSplitText;

/**
 * Created by simundi on 11/12/2014.
 */
public class TestComparisonsMoreFunctional {


    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Round #" + i);

            runAndMonitor(
                    "Array.sort normal",
                    text -> Arrays.sort(text, new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return o1.compareTo(o2);
                        }
                    })
            );

            runAndMonitor(
                    "Array.sort(Lambda)",
                    text -> Arrays.sort(text, (String o1, String o2) -> o1.compareTo(o2))

            );

            runAndMonitor(
                    "Stream.sorted()",
                    text -> Stream.of(text).sorted((String o1, String o2) -> o1.compareTo(o2)).toArray()
            );
        }

    }






    private static void runAndMonitor(String label , Consumer<String[]> sotringFunc){
        final String[] text = getSplitText();
        final long start = System.nanoTime();
        sotringFunc.accept(text);
        final long stop = System.nanoTime();
        final long timeNano = stop - start;
        final long timeMili = (long) (timeNano* 0.000001f);

        System.out.printf("%s \t\t%s|%s\n",label,timeMili, timeNano);
    }

}
