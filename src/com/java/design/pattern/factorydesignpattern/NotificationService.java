package com.java.design.pattern.factorydesignpattern;

public class NotificationService {
    public static void main(String[] args) {
        NotificationServiceI notificationServiceI = NotificationFactory.getInstance("SMS");
        notify(notificationServiceI);

        notificationServiceI = NotificationFactory.getInstance("Email");
        notify(notificationServiceI);

        notificationServiceI = NotificationFactory.getInstance("WatsApp");
        notify(notificationServiceI);
    }

    private static void notify(NotificationServiceI notificationServiceI) {
        notificationServiceI.notifyUser(
                new User(1,"Manoj Paul", "9015305593", "someone@somemaildomain.com"));
    }
}
