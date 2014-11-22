package com.simundi.java8.ch08;

import java.math.BigDecimal;
import java.util.function.Predicate;

/**
 * Created by simundi on 22/11/2014.
 */
public class StockUtil {

    public static StockInfo getPrice(final String ticker){
        return new StockInfo(ticker , YahooFinance.getPrice(ticker));
    }

    public static Predicate<StockInfo> isPriceLessThan(final int price){
        final Predicate<StockInfo> predicate = stockInfo ->
                stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
//        System.out.println("\t> Predicate: " + predicate);
        return predicate;
    }

    public static StockInfo pickHighest(final StockInfo stock1, final StockInfo stock2){
        final StockInfo highest = stock1.price.compareTo(stock2.price) > 0 ? stock1 : stock2;
//        System.out.println("\t> highest: " + highest);
        return highest;
    }

}
