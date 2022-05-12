package com.java.design.pattern.factorydesignpattern;

import java.util.Locale;

public class NotificationFactory {
    public static NotificationServiceI getInstance(String medium) {
        if (medium.toUpperCase().equals("EMAIL"))
            return new EmailNotification();
        if (medium.toUpperCase().equals("SMS"))
            return new SMSNotification();
        if(medium.toUpperCase().equals("WATSAPP"))
            return new WatsAppNotification();
        return null;
    }
}
