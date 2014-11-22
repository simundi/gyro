package com.simundi.java8.ch06.lazycollections;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by simundi on 21/11/2014.
 */
public class Primes {

    /**
     * - rangeCLosed method includes the last value. e.g rangeClosed(2,5) will do 2..5 inclusive.
     * - noneMatch takes a predicate and will yeld a boolean true if the lambda expression returns false
     * for all values inthe range (if there is no divisors)
     */
    public static boolean isPrime(final int number){
        return number > 1 &&
                IntStream.rangeClosed(2 , (int) Math.sqrt(number) )
                .noneMatch(divisor -> number % divisor == 0);
    }

    /**
     * recursively check the whether next number is prime
     */
    private static int primeAfter(final int number){

        if(isPrime(number +1)){
            return number + 1;
        }else{
            return primeAfter(number+1);
        }
    }

    public static List<Integer> primes(final int fromNumber , final int count){
        return Stream.iterate(fromNumber -1 , Primes::primeAfter)
                .limit(count)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println("10 primes from 1: " + primes(1 , 10));
    }

}
