package com.java.design.pattern.solid.problem.P1_SingleResponsibilityPrinciple;

public class BankService {
        public void deposit(Long amount){
            System.out.println("DEPOSIT");
        }

        public void withdraw(Long amount){
            System.out.println("WITHDRAW");
        }

        public void printPassbook(Long accountNumber){
            System.out.println("PRINT PASSBOOK");
        }

        public void getLoanInterestInfo(String loantype){
            if(loantype.equals("homeloan"))
                System.out.println("homeloan interest rate");
            else if(loantype.equals("personalloan"))
                System.out.println("personalloan interest rate");
            else if(loantype.equals("carloan"))
                System.out.println("carloan interest rate");
        }

        public void sendOTP(String medium){
            if(medium.equals("email"))
                System.out.println("Email send OTP");
        }
}
