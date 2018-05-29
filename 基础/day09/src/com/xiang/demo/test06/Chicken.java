package com.xiang.demo.test06;

/**
 * 鸡
 */
public class Chicken extends Poultry {

    public Chicken() {
    }

    public Chicken(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+ "岁的" + getColour() + "的" + getName() + "在啄米");
    }

    public void daMing(){
        System.out.println(getAge()+ "岁的" + getColour() + "的" + getName() + "在打鸣");
    }
}
