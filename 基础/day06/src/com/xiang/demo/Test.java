package com.xiang.demo;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //第二题
        /*Dog02 dog = new Dog02();
        dog.setName("旺财");
        dog.setAge(2);
        dog.showMsg();*/

        //第三题
        /*Teacher03 t = new Teacher03();
        t.setName("张老师");
        t.setAge(30);
        t.setContent("java面向对象的知识");
        t.eat();
        t.study();
        Student03 s = new Student03();
        s.setName("何同学");
        s.setAge(18);
        s.setContent("java面向对象的知识");
        s.eat();
        s.study();*/

        //第四题
        /*Card04 card04 = new Card04("红桃",'A');
        card04.showCard();*/

        //第五题
        /*Circle05 circle05 = new Circle05(8);
        circle05.showArea();
        circle05.showPerimeter();*/

        //第六题
        /*Coder06 coder06 = new Coder06();
        coder06.setId("9527");
        coder06.setName("Kobe");
        coder06.setSalary(10000);
        coder06.intro();
        coder06.showSalary();
        coder06.work();

        System.out.println("===============================");
        Manager06 manager06 = new Manager06();
        manager06.setId("0025");
        manager06.setName("James");
        manager06.setSalary(10000);
        manager06.setBonus(3000);
        manager06.intro();
        manager06.showSalary();
        manager06.work();*/

        //第七题
       /* MyDate07 myDate07 = new MyDate07();
        myDate07.setYear(2016);
        myDate07.setMonth(1);
        myDate07.setDay(1);
        myDate07.showDate();
        myDate07.isBi();*/

       //第八题
        Book08 book01 = new Book08(1,"JavaWeb实战","387777887524",38.8,new Date());
        Book08 book02 = new Book08(2,"Java编程思想","387648797524",88.8,new Date());
        Book08 book03 = new Book08(3,"Java从入门到放弃","455648797524",35.7,new Date());

       Book08 book = book01;
       if(book.getPrice() < book02.getPrice()){
           book=book02;
       }
       if(book.getPrice() < book03.getPrice()){
           book=book03;
       }

       /*  第二种比较方法
        Book08 temp = null;
        Book08 book = null;
        temp = book01.getPrice() > book02.getPrice() ? book01:book02;
        book = book03.getPrice() > temp.getPrice() ? book03:temp;
        */
        System.out.println("最贵的书是:");
        book.showBook();

    }

}
