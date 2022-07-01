package com.mayaha.dp.facade;

public class Screen {
    private static Screen instance = new Screen();
    public static Screen getInstance() {
        return instance;
    }
    public void up() {
        System.out.println("屏幕 升起");
    }
    public void down() {
        System.out.println("屏幕 降落");
    }
}