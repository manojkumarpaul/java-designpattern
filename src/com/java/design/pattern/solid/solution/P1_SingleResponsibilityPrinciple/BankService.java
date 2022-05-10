package com.java.design.pattern.solid.solution.P1_SingleResponsibilityPrinciple;

public class BankService {
        public void deposit(Long amount){
            System.out.println("DEPOSIT");
        }

        public void withdraw(Long amount){
            System.out.println("WITHDRAW");
        }
}
