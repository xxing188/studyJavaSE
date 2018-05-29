package com.xiang.demo.test06;

public class Student extends Person implements Sport {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("年龄为:" + getAge() + "岁的 " + getName() +" 学生在学生餐");
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为:" + getAge() + "岁的 " + getName() +" 学生在打篮球");
    }
}
