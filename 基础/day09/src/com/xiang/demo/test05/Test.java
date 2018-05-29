package com.xiang.demo.test05;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张平",30,"java");
        t.lecture();

        Student s = new Student("李小乐",18,85);
        s.score();
    }
}
