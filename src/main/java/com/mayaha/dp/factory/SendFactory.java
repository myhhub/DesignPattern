package com.mayaha.dp.factory;

public class SendFactory {
    public Sender produce(String type) {
        if ("text".equals(type)) {
            return new TextSender();

        }

        else if ("image".equals(type)) {
            return new ImageSender();

        }

        else if ("video".equals(type)) {
            return new VideoSender();

        }

        else {
            System.out.println("请输入正确的类型!");

            return null;

        }

    }

}