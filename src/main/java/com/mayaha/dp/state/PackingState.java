package com.mayaha.dp.state;

public class PackingState implements ICarState {
    @Override public void speedUp() {
        System.out.println("当前处于P档，车子无法移动");
    }
}

