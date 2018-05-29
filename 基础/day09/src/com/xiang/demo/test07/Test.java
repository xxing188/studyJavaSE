package com.xiang.demo.test07;


public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("m110","老王",1000);
        m.eat();
        m.work();

        Cook c = new Cook("c110","小王",6000);
        c.eat();
        c.work();

    }
}
