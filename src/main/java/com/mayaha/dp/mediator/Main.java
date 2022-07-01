package com.mayaha.dp.mediator;

public class Main {
    public static void main(String[] args) {
        MediatorUnitedNationsSecurityCouncil mediatorUNSC = new MediatorUnitedNationsSecurityCouncil();

        USA usa = new USA(mediatorUNSC);
        Iraq iraq = new Iraq(mediatorUNSC);

        mediatorUNSC.setUsa(usa);
        mediatorUNSC.setIraq(iraq);

        usa.declare("不准研制核武器");
        iraq.declare("我们没有核武器");
    }
}