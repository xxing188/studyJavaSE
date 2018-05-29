package com.xiang.demo.test02;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    //上课
    public void lecture(){
        System.out.println(getName() + "在上课!");
    }
}
