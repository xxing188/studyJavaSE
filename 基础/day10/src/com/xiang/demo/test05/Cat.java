package com.xiang.demo.test05;

import javax.naming.Name;

public class Cat extends Animal{

    public Cat(String name, double weight) {
        super(name, weight);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃鱼");
    }
    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
