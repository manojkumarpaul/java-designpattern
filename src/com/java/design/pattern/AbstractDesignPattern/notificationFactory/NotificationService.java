package com.java.design.pattern.AbstractDesignPattern.notificationFactory;

import com.java.design.pattern.factorydesignpattern.*;

//Incomplete yet
public class NotificationService {
    public static void main(String[] args) {
        //EmailNotification emailNotification = new EmailNotification(); -- client can't make direct instance
        NotificationServiceI notificationServiceI = NotificationFactory.getInstance("email");
        notify(notificationServiceI);

        notificationServiceI = NotificationFactory.getInstance("sms");
        notify(notificationServiceI);

        notificationServiceI = NotificationFactory.getInstance("watsapp");
        notify(notificationServiceI);
    }

    private static void notify(NotificationServiceI notificationServiceI) {
        notificationServiceI.notifyUser(
                new User(1,"Manoj Paul", "9015305593", "someone@somemaildomain.com"));
    }
}
