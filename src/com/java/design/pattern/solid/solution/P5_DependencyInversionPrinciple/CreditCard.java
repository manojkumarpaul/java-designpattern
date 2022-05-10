package com.java.design.pattern.solid.solution.P5_DependencyInversionPrinciple;

public class CreditCard implements CardI{
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

    @Override
    public void doTransaction() {
        System.out.println("Amount deducted: "+this.money);
    }
}
