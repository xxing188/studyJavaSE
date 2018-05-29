package com.xiang.demo.test06;

/**
 * 鸭
 */
public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+ "岁的" + getColour() + "的" + getName() + "在吃鱼");
    }

    public  void swimming(){
        System.out.println(getAge()+ "岁的" + getColour() + "的" + getName() + "游泳");
    }
}
