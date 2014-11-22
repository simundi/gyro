package com.simundi.java8.ch08;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;

/**
 * Created by simundi on 22/11/2014.
 */
public class YahooFinance {

    public static BigDecimal getPrice(final String ticker) {
//        System.out.println("\t>geting price: " + ticker);
        try (
                final InputStream stream = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker).openStream();
                final BufferedReader reader = new BufferedReader(new InputStreamReader(stream))
        ) {
            final String data = reader.lines().skip(1).findFirst().get();
            final String[] dataItems = data.split(",");
            return new BigDecimal(dataItems[dataItems.length - 1]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        System.out.println("AMD: " + getPrice("AMD"));

    }
}
