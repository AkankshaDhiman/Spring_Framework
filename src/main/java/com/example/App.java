package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean( "student" , Student.class);
        Laptop laptop = context.getBean( "laptop" , Laptop.class);
        System.out.println(student.getAge());
        System.out.println(laptop.getModel());


    }
}
