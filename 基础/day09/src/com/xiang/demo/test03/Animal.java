package com.xiang.demo.test03;

public class Animal {
    private String name;
    private String colour;
    private double price;

    public Animal() {
    }

    public Animal(String name, String colour, double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public void eat(){
        System.out.println(name + "吃饭!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
