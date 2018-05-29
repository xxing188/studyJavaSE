package com.xiang.demo.test03;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, String colour, double price) {
        super(name, colour, price);
    }

    //看家
    public void lookHouse(){
        System.out.println(getName() + "看家");
    }
}
