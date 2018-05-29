package com.xiang.demo.test06;

public class Test {
    public static void main(String[] args) {
        Chicken c = new Chicken("公鸡","红色",2);
        c.eat();
        c.daMing();

        Duck d = new Duck("鸭子","黑色",1);
        d.eat();
        d.swimming();
    }
}
