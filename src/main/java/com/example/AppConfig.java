package com.example;
import com.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student1() {
        Student student = new Student();
        student.setAge(22);
        student.setName("elon");
        return student;
    }
    @Bean(name = "student2")
    public Student student2() {
        Student student = new Student();
        student.setAge(25);
        student.setName("sundar");
        return student;
    }
    @Bean
    public Laptop laptop() {
        Laptop laptop = new Laptop();
        laptop.setmodel("mac");
        return laptop;
    }
}
