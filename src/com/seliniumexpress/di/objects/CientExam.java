package com.seliniumexpress.di.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CientExam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("objects.xml");
        System.out.println("object.xml loaded ......");

            Student student = context.getBean("stu",Student.class);

            student.Cheating();
    }
}
