package com.xiang.demo.test01.收发红包;

public class User {
    private String name;
    private double money;

    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println(name + "余额:" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
