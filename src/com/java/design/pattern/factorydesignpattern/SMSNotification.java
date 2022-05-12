package com.java.design.pattern.factorydesignpattern;

public class SMSNotification implements NotificationServiceI{
    SMSNotification(){
        //will lot allow to create instance outside package
    }
    public boolean notifyUser(User user){
        System.out.println("SMS notification sent to : "+user.getCellPhone());
        return true;
    }
}
