package com.java.design.pattern.solid.problem.P2_OpenClosedPrinciple;

public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equals("email"))
            System.out.println("Email send OTP");

        //everytime a new medium changes we need to change the method directly, this violates Open-Closed Principle
        if(medium.equals("watsapp"))
            System.out.println("watsapp send OTP");
    }
}
