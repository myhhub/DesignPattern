package com.mayaha.dp.flyweight;
import java.util.ArrayList;

import java.util.List;
public class Main {
    private static final String colors[] =  { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =(Circle)ShapeFlyWeightFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        // 打印生成的数量
        System.out.println("共生成了: 20 个圆！ ");

        // 打印生成的java对象数量
        System.out.println("共生成了： " + ShapeFlyWeightFactory.getTotalObjects() + " 个 FlyWeight java对象! ");

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
