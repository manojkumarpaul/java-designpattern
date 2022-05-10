package com.java.design.pattern.solid.solution.P1_SingleResponsibilityPrinciple;

public class LoanService {
    public void getLoanInterestInfo(String loantype){
        if(loantype.equals("homeloan"))
            System.out.println("homeloan interest rate");
        else if(loantype.equals("personalloan"))
            System.out.println("personalloan interest rate");
        else if(loantype.equals("carloan"))
            System.out.println("carloan interest rate");
    }
}
