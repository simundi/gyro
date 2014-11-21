package com.simundi.java8.ch04.exceptionsAndLambda;

/**
 * Created by simundi on 21/11/2014.
 */
@FunctionalInterface
public interface UserInstance<T, X extends Throwable> {

    void accept(T instance) throws X;

}
