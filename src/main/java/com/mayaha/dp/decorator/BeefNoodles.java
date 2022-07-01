package com.mayaha.dp.decorator;

public class BeefNoodles implements Noodles {
    private final float price = 30;
    private String name = "beefNoodles";

    @Override
    public float cost() {
        return price;
    }

    @Override
    public String description() {
        return name;
    }
}

