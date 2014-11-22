package com.simundi.java8.ch07.factorialrecursion;

import java.math.BigInteger;

import static com.simundi.java8.ch07.factorialrecursion.BigFactorial.*;

/**
 * Created by simundi on 22/11/2014.
 */
public class Factorial {

    public static int factorialRec(final int number) {
        if (number == 1)
            return number;
        else
            return number * factorialRec(number - 1);
    }

    public static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number) {
        if (BigInteger.ONE.equals(number)) {
            return TailCallsUtilClass.done(factorial);
        } else {
//            System.out.printf(">> next factorial=%s number=%s%n ", factorial, number);
            return TailCallsUtilClass.call(() -> factorialTailRec(multiply(factorial, number), decrement(number)));
        }
    }

    private static BigInteger factorial(final int factorial, final int number) {
        return factorialTailRec(BigInteger.valueOf(factorial),BigInteger.valueOf(number)).invoke();
    }

    public static void main(String[] args) {
        System.out.printf("Result of factorialTailRec(1 ,2): %s%n", factorial(1,2));
        System.out.printf("Result of factorialTailRec(1 ,5): %s%n", factorial(1, 5));
        System.out.printf("Result of factorialTailRec(1 ,10): %s%n", factorial(1, 10));
        System.out.printf("Result of factorialTailRec(1 ,20000): %s%n", factorial(1, 20000));
    }


}
