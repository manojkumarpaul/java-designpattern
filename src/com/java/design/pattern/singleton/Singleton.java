package com.java.design.pattern.singleton;
/*
* Prior to Java5, memory model had a lot of issues and below methods caused failure in
* certain scenarios in multithreaded environment. So, Bill Pugh suggested a concept of
* inner static classes to use for singleton.
* */
public class Singleton {
    private static Singleton singletonInstance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}
