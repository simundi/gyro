package com.simundi.java8.ch08;

import java.math.BigDecimal;
import java.util.stream.Collectors;

/**
 * Created by simundi on 22/11/2014.
 */
public class Socks100 {

    public static void main(String[] args) {

        final BigDecimal HUNDRED = new BigDecimal("100");
        System.out.println("Symbles over 100: " +
                Tickers.symbols
                        .stream()
                        .filter(
                                symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0
                        ).sorted()
                        .collect(Collectors.joining(", ")
                        ));
    }
}
