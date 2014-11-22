package com.simundi.java8.ch08;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * Created by simundi on 22/11/2014.
 */
public class PickStockFunctional {

    public static StockInfo findHighPriced(final Stream<String> symbols) {

        return symbols
                .map(StockUtil::getPrice)
                .filter(StockUtil.isPriceLessThan(500))
                .reduce(StockUtil::pickHighest)
                .get();

        /* Same as code below without method references
        symbols
                .map( (final String symbol) ->  StockUtil.getPrice(symbol))
                .filter( (final StockInfo stock) -> stock.price.compareTo(BigDecimal.valueOf(500)) < 0 )
                .reduce( (final StockInfo stock1 , final StockInfo stock2) ->  StockUtil.pickHighest(stock1, stock2))
                .get();
        */
    }


    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        final StockInfo highPriced = findHighPriced(Tickers.symbols.stream());
        final long end = System.currentTimeMillis();
        System.out.printf("Highest: %s calculated in %s ms%n", highPriced, end - start);


        final long start2 = System.currentTimeMillis();
        final StockInfo highPriced2 = findHighPriced (Tickers.symbols.parallelStream());
        final long end2 = System.currentTimeMillis();
        System.out.printf("Highest: %s - calculated in %s ms%n" , highPriced2, end2-start2);

    }
}
