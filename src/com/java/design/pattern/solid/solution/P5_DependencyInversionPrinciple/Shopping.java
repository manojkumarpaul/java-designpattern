package com.java.design.pattern.solid.solution.P5_DependencyInversionPrinciple;

public class Shopping {
    public static void main(String[] args) {

        CardI dc = new DebitCard(10000);
        CardI cc = new CreditCard(5000);
        doTheTransaction(dc);
        doTheTransaction(cc);
    }

    private static void doTheTransaction(CardI cardI) {
        cardI.doTransaction();
    }
}
