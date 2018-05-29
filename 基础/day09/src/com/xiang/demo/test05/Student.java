package com.xiang.demo.test05;

public class Student extends Person{
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public void score(){
        System.out.println(getName()+ "考试得了" + score + "分");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
