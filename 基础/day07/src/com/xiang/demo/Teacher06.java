package com.xiang.demo;

public class Teacher06 {
    private String name;
    private int age;
    private String like;

    public Teacher06() {
    }

    public Teacher06(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public void show(){
        System.out.println(name + "," + age + "," + like);
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
