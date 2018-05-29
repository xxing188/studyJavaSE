package com.xiang.demo.test03;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String colour, double price) {
        super(name, colour, price);
    }

    public void grabMouse(){
        System.out.println(getName() + "抓老鼠!");
    }
}
