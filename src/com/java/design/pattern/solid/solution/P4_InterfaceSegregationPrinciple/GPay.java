package com.java.design.pattern.solid.solution.P4_InterfaceSegregationPrinciple;

import com.java.design.pattern.solid.solution.P4_InterfaceSegregationPrinciple.UPIPayment;

//All looks good as GPay supports all the method
public class GPay implements UPIPayment, UPICashBack {
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
