package com.xiang.demo.test05;

public class Dog extends Animal {

    public Dog(String name, double weight) {
        super(name, weight);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
    public void lookHome(){
        System.out.println("老老实实看家");
    }
}
