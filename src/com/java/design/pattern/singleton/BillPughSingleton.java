package com.java.design.pattern.singleton;

public class BillPughSingleton {
    private static class singleton{
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    private BillPughSingleton(){

    }

    public static BillPughSingleton getInstance(){
        return singleton.billPughSingleton;
    }
}
