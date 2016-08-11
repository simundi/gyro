package com.simundi.java8.ch01;

/**
 * @author Alexandre Simundi on 29/07/2016.
 */
public class BrandsProblem {




    private class Brand{
        private Integer id;
        private String name;
        private Double avgPrice;
        private Double sumPrice;
        private Long count;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getAvgPrice() {
            return avgPrice;
        }

        public void setAvgPrice(Double avgPrice) {
            this.avgPrice = avgPrice;
        }

        public Double getSumPrice() {
            return sumPrice;
        }

        public void setSumPrice(Double sumPrice) {
            this.sumPrice = sumPrice;
        }

        public Long getCount() {
            return count;
        }

        public void setCount(Long count) {
            this.count = count;
        }
    }
}
