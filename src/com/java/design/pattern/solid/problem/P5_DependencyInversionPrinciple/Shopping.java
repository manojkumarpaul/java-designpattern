package com.java.design.pattern.solid.problem.P5_DependencyInversionPrinciple;

public class Shopping {
    public static void main(String[] args) {

        DebitCard dc = new DebitCard(10000);
        CreditCard cc = new CreditCard(5000);
        doTheTransaction(dc);
        doTheTransaction(cc);

    }

    private static void doTheTransaction(DebitCard dc) {
        dc.doTransaction();
    }

    private static void doTheTransaction(CreditCard cc) {
        cc.doTransaction();
    }


}
