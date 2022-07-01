package com.mayaha.dp.facade;

public class Main {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.ready();
        System.out.println("=====================");
        homeFacade.play();
        System.out.println("=====================");
        homeFacade.pause();
        System.out.println("=====================");
        homeFacade.end();
    }
}
