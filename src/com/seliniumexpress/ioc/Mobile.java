package com.seliniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");
        Airtel airtel = (Airtel) context.getBean("airtel");

        Vodaphone vodaphone = context.getBean("vodaphone",Vodaphone.class);

        vodaphone.calling();
        vodaphone.data();

        airtel.calling();
        airtel.data();
    }
}
