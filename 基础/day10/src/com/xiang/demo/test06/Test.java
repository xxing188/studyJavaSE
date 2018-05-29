package com.xiang.demo.test06;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("王中王",22);
        Teacher t = new Teacher("姚小明",42);

        goToSport(s);
        goToSport(t);

    }
    public static void goToSport(Sport sport){
        if(sport instanceof Student){
            Student s = (Student) sport;
            //s.eat();
            s.playBasketball();
        }
        if(sport instanceof Teacher){
            Teacher t = (Teacher)sport;
            //t.eat();
            t.playBasketball();
        }

    }
}
