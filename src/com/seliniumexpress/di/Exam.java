package com.seliniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("students.xml");
        System.out.println("Config loaded");

      Student subbu =  context.getBean("student",Student.class);
      subbu.displayStudentInfo();

      Student sunny = context.getBean("student1",Student.class);
      sunny.displayStudentInfo();
    }
}
