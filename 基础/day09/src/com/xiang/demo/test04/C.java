package com.xiang.demo.test04;

public class C extends B{
     int numc = 30;

    @Override
    void showA() {
        System.out.println("A类中numa:" +numa);
    }

    @Override
    void showB() {
        System.out.println("B类中numb:" + numb);
    }

    void showC(){
        System.out.println("C类中numc:"+numc);
    }


}
