package com.java.design.pattern.solid.solution.P1_SingleResponsibilityPrinciple;

public class P1_SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.deposit(10L);
        bankService.withdraw(10L);
        new PrinterService().printPassbook(876L);
        new LoanService().getLoanInterestInfo("carloan");
        new NotificationService().sendOTP("email");
    }
}


