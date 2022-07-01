package com.mayaha.dp.adapter;

/**

 * 对象适配器： 使用对象组合的方式，是动态组合的方式。

 * 既能画方又能画圆

 * @author stone

 * DrawAdapter是适配器，DrawRectangle属于adapter,是被适配者，适配器将被适配者和适配目标(DrawCircle)进行适配

 *

 */

public class DrawAdapter4Object implements IDrawCircle {//既能画方又能画圆

    private DrawRectangle drawRectangle;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public DrawAdapter4Object(DrawRectangle drawRectangle) {

        this.drawRectangle = drawRectangle;

    }

    @Override

    public void drawCircle() {

        System.out.println("DrawAdapter4Object: drawcircle");

    }

    public void drawRectangle(String msg) {

        drawRectangle.drawRectangle(msg);

    }

}