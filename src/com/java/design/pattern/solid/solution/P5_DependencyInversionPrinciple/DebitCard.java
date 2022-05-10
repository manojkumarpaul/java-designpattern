package com.java.design.pattern.solid.solution.P5_DependencyInversionPrinciple;

public class DebitCard implements CardI{
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


    @Override
    public void doTransaction() {
        System.out.println("Amount deducted: "+this.money);
    }
}
