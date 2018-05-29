package com.xiang.demo.test05;

public class Teacher extends Person {
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void lecture(){
        System.out.println(getName() + "讲授" + subject + "课程");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
