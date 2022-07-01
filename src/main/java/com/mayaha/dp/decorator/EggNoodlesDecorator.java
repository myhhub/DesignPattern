package com.mayaha.dp.decorator;

public class EggNoodlesDecorator implements NoodlesDecorator {
    private float eggPrice=3;
    private String name = "egg";
    private Noodles noodles;

    public EggNoodlesDecorator(Noodles noodles){
        this.noodles = noodles;
    }

    @Override
    public float cost() {
        return eggPrice + noodles.cost();
    }

    @Override
    public String description() {
        return name + noodles.description();
    }
}
