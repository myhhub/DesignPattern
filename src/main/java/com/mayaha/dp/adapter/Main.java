package com.mayaha.dp.adapter;
/*
一、根据作用范围来分；根据是用于类上还是用于对象上划分分为类模式和对象模式两种。
1、类模式：用于处理类与子类之间的关系，这些关系通过继承来建立，在编译时刻便确定下来了。工厂方法、（类）适配器、模板方法、解释器均属于该模式。
2、对象模式：用于处理对象之间的关系，这些关系可以通过组合或聚合来实现，在运行时刻是可以变化的，更具动态性。除了以上 4 种，其他的都是对象模式。
*/
public class Main {
    public static void main(String[] args) {

//对象适配器

        DrawAdapter4Object objAdapter = new DrawAdapter4Object(new DrawRectangle());

        objAdapter.drawCircle();

        objAdapter.drawRectangle(" in DrawAdapter4Object");

        System.out.println("--------------");

//类适配器

        DrawAdapter4Class clzAdapter = new DrawAdapter4Class();

        clzAdapter.drawCircle();

        clzAdapter.drawRectangle("in DrawAdapter4Class");

        System.out.println("--------------");

//接口适配器

        MyDrawAdapter myDrawAdapter = new MyDrawAdapter();

        myDrawAdapter.drawCircle();

        myDrawAdapter.drawRectangle();

    }

    static class MyDrawAdapter extends DefaultDrawAdapter {

        @Override

        public void drawCircle() {

            System.out.println("drawCircle in MyDrawAdapter");

        }

    }
}
