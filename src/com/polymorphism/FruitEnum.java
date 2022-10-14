package com.polymorphism;

public enum FruitEnum {
    Orange(50, 115.1f),
    Lemon(10,165.1f),
    Apple(100, 30.9f),
    Pear(45,54.8f),
    Banana(90,73.2f);

    public final int kilo;
    public final float price;

    FruitEnum (int kilo, float price){
        this.kilo = kilo;
        this.price = price;
    }
}
