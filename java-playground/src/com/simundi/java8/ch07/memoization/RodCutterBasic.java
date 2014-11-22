package com.simundi.java8.ch07.memoization;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by simundi on 22/11/2014.
 */
public class RodCutterBasic {

    static final List<Integer> priceValues = Arrays.asList(2,1,1,2,2,2,1,8,9,15);


    final List<Integer> prices;

    public RodCutterBasic(List<Integer> prices) {
        this.prices = prices;
    }

    /**
     * find price for a particular lenght, then recursivelly find prices for the lengths that add up to the give length
     * @param length
     * @return
     */
    public int maxProfit(final int length){
        int profit = length <= prices.size()? prices.get(length-1):0;
        for (int i = 1; i < length; i++){
            int priceWhenCut = maxProfit(i) + maxProfit(length -i);
            if(profit <  priceWhenCut) profit = priceWhenCut;
        }

        return profit;
    }


    /**
     * MaxProfit calculation it's defined in a function
     * BiFuction which receives as input 1) a function to calculate max profit and an int withc is the length to be calculated
     *
     * The Memoizer will cache the results of the maxProfit function based on the length
     */
    public int maxProfitOptmized(final int rodLength){
        BiFunction<Function<Integer, Integer> , Integer, Integer  > compute =
                (func , length) -> {
                    int profit = length <= prices.size()? prices.get(length-1):0;
                    for (int i = 1; i < length; i++){
                        int priceWhenCut = func.apply(i) + func.apply(length - i);
                        if(profit <  priceWhenCut) profit = priceWhenCut;
                    }
                    return profit;
                };

        return Memoizer.callMemoized(compute , rodLength);
    }


    public static void main(String[] args) {
        final RodCutterBasic cutterBasic = new RodCutterBasic(priceValues);

        System.out.println("Profit " + cutterBasic.maxProfitOptmized(5) );
        System.out.println("Profit " + cutterBasic.maxProfitOptmized(22) );

    }

}
