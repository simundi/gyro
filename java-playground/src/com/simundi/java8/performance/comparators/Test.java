package com.simundi.java8.performance.comparators;

/**
 * Created by simundi on 02/05/2015.
 */
public class Test {

    public static void main(String[] args) {
        int[] a ={1};

        final Test test = new Test();
        test.increment(a);

        System.out.println(a[a.length -1]);


    }

    public void increment(int[] i){
        i[i.length -1]++;
    };




}
