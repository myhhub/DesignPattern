package com.mayaha.dp.state;

public class ReverseState implements ICarState {
    @Override public void speedUp() {
        System.out.println("当前处于R档，倒车");
    }
}