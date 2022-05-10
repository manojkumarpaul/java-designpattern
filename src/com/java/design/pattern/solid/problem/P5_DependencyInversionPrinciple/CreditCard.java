package com.java.design.pattern.solid.problem.P5_DependencyInversionPrinciple;

public class CreditCard {
    private int money;

    public CreditCard(int i) {
        this.money = i;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int amount) {
        money = amount;
    }

    public void doTransaction() {
        System.out.println("Amount deducted:: "+this.money);
    }
}
