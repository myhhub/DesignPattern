package com.mayaha.dp.mediator;

/**
 * 抽象国家类
 */
public abstract class Country {

    protected AbstractMediatorUnitedNations unitedNations;//每个国家都要声明中介者

    public Country(AbstractMediatorUnitedNations unitedNations){
        this.unitedNations = unitedNations;
    }

}
