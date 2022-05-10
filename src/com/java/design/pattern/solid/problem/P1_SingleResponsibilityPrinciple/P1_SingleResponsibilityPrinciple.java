package com.java.design.pattern.solid.problem.P1_SingleResponsibilityPrinciple;

public class P1_SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.deposit(10L);
        bankService.withdraw(10L);
        bankService.printPassbook(876L);
        bankService.getLoanInterestInfo("carloan");
        bankService.sendOTP("email");
    }
}


