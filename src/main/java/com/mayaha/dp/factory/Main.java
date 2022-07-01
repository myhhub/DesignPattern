package com.mayaha.dp.factory;

public class Main {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender text=factory.produce("text");

        text.send();

        Sender image=factory.produce("image");

        image.send();

        Sender video=factory.produce("video");

        video.send();


    }
}
