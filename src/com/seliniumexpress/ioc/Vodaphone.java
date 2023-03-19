package com.seliniumexpress.ioc;

public class Vodaphone implements Sim{

    public Vodaphone() {
        System.out.println("Vodaphne cnstr called .... ");
    }

    @Override
    public void calling() {
        System.out.println( "caling using VodaPhone Sim ");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using  Vodaphone Sim ");

    }
}
