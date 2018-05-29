package com.xiang.demo.test07;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为:" +getId() + "姓名为:"+ getName() +"老王工资为:" + getSalary() + "在工作,炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为:" +getId() + "姓名为:"+ getName() +"老王工资为:" + getSalary() + "在吃肉");
    }
}
