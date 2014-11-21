package com.simundi.java8.ch04.designWithLambdas;

/**
 * Created by simundi on 20/11/2014.
 */
public class Asset {

    public enum AssetType {BOND , STOCK};

    private final AssetType type;
    private final int value;

    public Asset(AssetType type, int value) {
        this.type = type;
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
