package com.java.design.pattern.factorydesignpattern;

public class WatsAppNotification implements NotificationServiceI{
    WatsAppNotification(){
        //will lot allow to create instance outside package
    }
    public boolean notifyUser(User user){
        System.out.println("WatsApp notification sent to : "+user.getCellPhone());
        return true;
    }
}
