package com.java.design.pattern.solid.problem.P4_InterfaceSegregationPrinciple;

//This is bad as PhonePay doesn't support getCashbackAsCreditBalance() and is forced upon it as an additional method.

public class PhonePay implements UPIPayment {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashbackAsCreditBalance() {

    }
}
