package com.java.design.pattern.solid.solution.P2_OpenClosedPrinciple;

public class EmailServiceImpl implements NotificationServiceI {
    @Override
    public void sendOTP(String medium) {
        System.out.println("Email send OTP");
    }
}
