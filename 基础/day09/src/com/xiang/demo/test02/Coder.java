package com.xiang.demo.test02;

public class Coder extends Person {
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    //敲代码
    public void coding(){
        System.out.println(getName() + "在敲代码!");
    }
}
