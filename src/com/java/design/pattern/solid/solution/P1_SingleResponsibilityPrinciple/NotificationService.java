package com.java.design.pattern.solid.solution.P1_SingleResponsibilityPrinciple;

public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equals("email"))
            System.out.println("Email send OTP");
        if(medium.equals("watsapp"))
            System.out.println("watsapp send OTP");
    }
}
