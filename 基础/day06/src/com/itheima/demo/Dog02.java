package com.itheima.demo;

//
public class Dog02 {
   private String name;
   private int age;

    public Dog02() {

    }

    public Dog02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showMsg(){
        System.out.println("狗的名称为:" + name + ",年龄为:" + age);
    }
}
