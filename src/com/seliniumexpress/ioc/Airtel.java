package com.seliniumexpress.ioc;

public class Airtel implements  Sim {

    public Airtel() {
        System.out.println("Airtel constr called...");
    }

    @Override
    public void calling() {
        System.out.println( "caling using Airtel Sim ");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using  Airtel Sim ");

    }
}
