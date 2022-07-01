package com.mayaha.dp.mediator;

/**
 * 美国实现类
 */
public class USA extends Country{
    public USA(AbstractMediatorUnitedNations unitedNations){
        super(unitedNations);
    }

    public void declare(String message){
        unitedNations.declare(message,this);
    }

    public void acquireMessage(String message){
        System.out.println("美国获得对方信息:" + message);
    }
}
