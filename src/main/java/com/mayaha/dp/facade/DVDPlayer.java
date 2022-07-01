package com.mayaha.dp.facade;

public class DVDPlayer {
    // 单例模式 饿汉式
    private static DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("DVD 打开");
    }
    public void off() {
        System.out.println("DVD 关闭");
    }
    public void play() {
        System.out.println("DVD 播放");
    }
    public void pause() {
        System.out.println("DVD 暂停");
    }
}