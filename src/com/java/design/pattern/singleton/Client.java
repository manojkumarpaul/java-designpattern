package com.java.design.pattern.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
    }
}
