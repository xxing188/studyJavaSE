package com.xiang.demo;

public class Car {
    private static Car car = new Car();
    private Car(){ }

    public static Car getInstance(){
        return car;
    }

    public void run(){
        System.out.println("车起火了跑....");
    }
}
