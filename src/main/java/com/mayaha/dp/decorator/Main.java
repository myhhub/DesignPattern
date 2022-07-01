package com.mayaha.dp.decorator;

public class Main {
    public static void main(String[] args) {
        Noodles beef = new BeefNoodles();
        System.out.println(beef.description());
        Noodles eggbeef = new EggNoodlesDecorator(beef);
        System.out.println(eggbeef.description());
    }
}
