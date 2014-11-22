package com.simundi.java8.ch07.factorialrecursion;

/**
 * Created by simundi on 22/11/2014.
 */
public class TailCallsUtilClass {

    public static <T> TailCall<T> call (final TailCall<T> nextCall){
        return nextCall;
    }

    public static <T> TailCall<T> done (final T result){
        return new TailCall<T>() {

            @Override
            public TailCall<T> apply() {
                throw new Error("Apply Not implemented");
            }

            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public T result() {
                return result;
            }
        };
    }


}
