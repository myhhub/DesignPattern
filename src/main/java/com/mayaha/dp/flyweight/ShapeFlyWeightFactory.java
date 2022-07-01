package com.mayaha.dp.flyweight;

//紧接着实现享元工厂类：
import java.util.HashMap;
public class ShapeFlyWeightFactory {
    private static final HashMap<String, ShapeFlyWeight> circleMap = new HashMap<>();

    public static ShapeFlyWeight getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    public static int getTotalObjects(){

        return circleMap.size();

    }
}