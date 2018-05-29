package com.xiang.demo.test05;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog("狗",50);
        d.eat();

        Animal c = new Cat("猫",5);
        c.eat();

        if(d instanceof Animal){
            Dog dog = (Dog) d;
            dog.lookHome();
        }
        if(c instanceof  Animal){
            Cat cat = (Cat) c;
            cat.catchMouse();
        }
    }
}
