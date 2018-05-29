package com.xiang.demo.test02;

public class Test {
    public static void main(String[] args) {
        Coder c = new Coder("马画藤",45);
        c.eat();
        c.sleep();
        c.coding();
        System.out.println("--------------");
        Teacher t = new Teacher("马云",50);
        t.eat();
        t.sleep();
        t.lecture();
    }
}
