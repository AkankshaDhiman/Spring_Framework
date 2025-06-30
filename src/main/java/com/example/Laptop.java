package com.example;

public class Laptop {
    private String model;

    public Laptop( String model ) {
        this.model = model;
    }
    public Laptop() {
        System.out.println("default constructor");
    }
    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

}
