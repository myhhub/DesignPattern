package com.mayaha.dp.adapter;

/*

 * 接口适配器:接口中有抽象方法，我们仅仅想实现当中的几个。不想所有实现，

 * 所以提供一个默认空实现，然后继承自它，重写实现我们想实现的方法

 */

public interface IDraw {

    void drawCircle();

    void drawRectangle();

}