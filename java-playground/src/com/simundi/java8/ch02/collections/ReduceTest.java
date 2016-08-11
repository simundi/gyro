package com.simundi.java8.ch02.collections;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author Alexandre Simundi on 29/07/2016.
 */
public class ReduceTest {


    public static void main(String[] args) {


        final List<Brand> brands = Arrays
            .asList(
                new Brand("Nike", 65),
                new Brand("mango", 40),
                new Brand("adidas", 35),
                new Brand("basement home", 27),
                new Brand("rosen", 48)
            );


        final int sum = brands
            .stream()
            .mapToInt(b -> b.getCount())
            .limit(2)
            .sum();
        System.out.println("Top 2 Sum: " + sum);

        final IntSummaryStatistics statistics = brands
            .stream()
            .skip(2)
            .mapToInt(b -> b.getCount())
            .summaryStatistics();
        System.out.println("Others Sum: " + statistics);


        final Brand otherBrand = brands
            .stream()
            .skip(2)
            .reduce((b1, b2) -> new Brand("Other", b1.getCount() + b2.getCount()))
            .get();
        System.out.println("Others Brand: " + otherBrand);
    }

    public static class Brand{
        private String name;
        private Integer count;

        public Brand(String name, Integer count) {
            this.name = name;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public Integer getCount() {
            return count;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            sb.append("name='").append(name).append('\'');
            sb.append(", count=").append(count);
            sb.append('}');
            return sb.toString();
        }
    }




}
