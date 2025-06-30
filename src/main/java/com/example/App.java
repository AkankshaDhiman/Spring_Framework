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

        Student student1 = context.getBean( "student1" , Student.class);
        Student student2 = context.getBean( "student2" , Student.class);
        Laptop laptop = context.getBean( "laptop" , Laptop.class);
        System.out.println(student1.getAge());
        System.out.println(laptop.getmodel());
        System.out.println(student1==student2);


    }
}
