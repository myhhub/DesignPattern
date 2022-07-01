package com.mayaha.dp.state;

public class DriveState implements ICarState {
    @Override public void speedUp() {
        System.out.println("当前处于D档，车子前进");
    }
}