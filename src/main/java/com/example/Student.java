package com.example;

public class Student {
    private int age;
    private String name;

//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
    public Student() {
        System.out.println("Student default Constructor");
    }

    public int getAge() {
        System.out.println("Age of the student is " + age);
        return age;

    }

    public void setAge(int age) {
        System.out.println("Setter method of age for student class");
        this.age = age;
    }

    public String getName() {
        System.out.println("Name of the student is " + name);
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter method of name for student class");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
