package com.mayaha.dp.state;

public class Main {
    public static void main(String[] args) {
        CarContext car = new CarContext();
        car.setState(new PackingState());
        car.sppedUp();
    }
}
