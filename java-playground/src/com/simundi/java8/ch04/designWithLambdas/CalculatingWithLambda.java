package com.simundi.java8.ch04.designWithLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static com.simundi.java8.ch04.designWithLambdas.Asset.AssetType.BOND;
import static com.simundi.java8.ch04.designWithLambdas.Asset.AssetType.STOCK;

/**
 * Created by simundi on 20/11/2014.
 */
public class CalculatingWithLambda {

    private static final List<Asset> assets = Arrays.asList(
            new Asset(BOND, 1000),
            new Asset(BOND, 2000),
            new Asset(STOCK, 3000),
            new Asset(STOCK, 4000)
    );

    public static int totalAssets(List<Asset> assets ){
        return assets
                .stream()
                .mapToInt(asset -> asset.getValue())
                .sum();
    }

    public static int totalBonds(List<Asset> assets ){
        return assets
                .stream()
                .filter( asset -> BOND == asset.getType())
                .mapToInt(asset -> asset.getValue())
                .sum();
    }


    public static int totalAssets(List<Asset> assets , Predicate<Asset> assetFilter){
        return assets
                .stream()
                .filter(assetFilter)
                .mapToInt(asset -> asset.getValue())
                .sum();
    }

    public static void main(String[] args) {
        System.out.printf("Total Assets %s%n" , totalAssets(assets));
        System.out.printf("Total Bonds %s%n" , totalBonds(assets));
        System.out.printf("Total Stocks %s%n" , totalAssets(assets, asset -> STOCK == asset.getType()));

        System.out.printf("Total Assets(include all) %s%n" , totalAssets(assets , asset -> true));//Include All
        System.out.printf("Total Stocks(predicate) %s%n" , totalAssets(assets , asset -> STOCK.equals(asset.getType())));//Include All
    }


}
