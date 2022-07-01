package com.mayaha.dp.facade;

public class Stereo {
    private static Stereo instance = new Stereo();
    public static Stereo getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("立体声 开");
    }
    public void off() {
        System.out.println("立体声 关");
    }
    public void up() {
        System.out.println("立体声 音量调高");
    }
}