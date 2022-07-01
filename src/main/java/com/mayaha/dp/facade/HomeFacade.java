package com.mayaha.dp.facade;

public class HomeFacade {
    // 定义各个子系统对象
    private Popcorn popcorn;
    private Stereo stereo;
    private Screen screen;
    private Projector projector;
    private DVDPlayer dvdPlayer;

    public HomeFacade() {
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
    }
    public void play() {
        dvdPlayer.play();
    }
    public void pause() {
        dvdPlayer.pause();
    }
    public void end() {
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}