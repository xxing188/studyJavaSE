package com.xiang.demo.test06;

public class Teacher extends Person implements Sport {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("年龄为:" + getAge() + "岁的 " + getName() +" 老师在工作餐");
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为:" + getAge() + "岁的 " + getName() +" 老师在打篮球");
    }
}
