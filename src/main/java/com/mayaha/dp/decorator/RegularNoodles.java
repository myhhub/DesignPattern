package com.mayaha.dp.decorator;

public class RegularNoodles implements Noodles{
    private final float price = 10;
    private String name = "regularNoodles";


    @Override
    public float cost() {
        return price;
    }

    @Override
    public String description() {
        return name;
    }
}