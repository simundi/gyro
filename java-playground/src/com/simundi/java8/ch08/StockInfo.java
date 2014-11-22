package com.simundi.java8.ch08;

import java.math.BigDecimal;

/**
 * Created by simundi on 22/11/2014.
 */
public class StockInfo {

    public final String ticket;
    public final BigDecimal price;

    public StockInfo(String ticket, BigDecimal price) {
        this.ticket = ticket;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("StockInfo{ticket=%s, price=%g'}", ticket, price);
    }
}
