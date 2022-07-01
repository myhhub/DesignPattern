package com.mayaha.dp.mediator;

/**
 * 联合国安理会实现类
 */
public class MediatorUnitedNationsSecurityCouncil extends AbstractMediatorUnitedNations {
    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if(country == usa) {
            iraq.acquireMessage(message);
        } else {
            usa.acquireMessage(message);
        }
    }
}