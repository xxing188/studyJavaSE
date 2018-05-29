package com.xiang.demo.test06;

/**
 * 家禽类
 */
public abstract class Poultry {
    private String name;
    private String colour;
    private int age ;

    public Poultry() {
    }

    public Poultry(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public abstract void eat();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
