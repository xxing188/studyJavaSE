package com.itheima.demo;

public class Student03 {
    private String name;
    private int age;
    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat(){
        System.out.println("年龄为" + age + "的" + name + "正在吃饭");
    }
    public void study(){
        System.out.println("年龄为" + age + "的" + name + "正在专心的听着" + content + "....");
    }
}
