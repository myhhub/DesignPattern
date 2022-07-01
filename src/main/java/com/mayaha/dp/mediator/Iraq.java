package com.mayaha.dp.mediator;

/**
 * 伊拉克实现类
 */
public class Iraq extends Country{
    public Iraq(AbstractMediatorUnitedNations unitedNations){
        super(unitedNations);
    }

    public void declare(String message){
        unitedNations.declare(message,this);
    }

    public void acquireMessage(String message){
        System.out.println("伊拉克获得对方信息:" + message);
    }
}