package com.java.design.pattern.factorydesignpattern;

public class EmailNotification implements NotificationServiceI{
    EmailNotification(){
        //will lot allow to create instance outside package
    }
    public boolean notifyUser(User user){
        System.out.println("Email notification sent to : "+user.getEmailId());
        return true;
    }
}
