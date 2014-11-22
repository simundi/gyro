package com.simundi.java8.ch07.factorialrecursion;

import java.math.BigInteger;

/**
 * Created by simundi on 22/11/2014.
 */
public class BigFactorial {

    final static BigInteger FIVE = new BigInteger("5");
    final static BigInteger TWENTYK = new BigInteger("20000");

    public static BigInteger decrement(final BigInteger number){
        return number.subtract(BigInteger.ONE);
    }

    public static BigInteger multiply(final BigInteger first, final BigInteger second){
        return first.multiply(second);
    }



}
