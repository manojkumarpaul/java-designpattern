package com.java.design.pattern.solid.solution.P2_OpenClosedPrinciple;

public class WatsappServiceImpl implements NotificationServiceI {
    @Override
    public void sendOTP(String medium) {
        System.out.println("Watsapp send OTP");
    }
}
