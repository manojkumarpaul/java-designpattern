package com.java.design.pattern.solid.problem.P5_DependencyInversionPrinciple;

public class DebitCard {
    private int money;

    public DebitCard(int i) {
        this.money = i;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int amount) {
        this.money = amount;
    }

    public void doTransaction() {
        System.out.println("Amount deducted: "+this.money);
    }
}
