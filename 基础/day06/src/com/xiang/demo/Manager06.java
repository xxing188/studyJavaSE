package com.xiang.demo;

public class Manager06 {
    private String id;
    private String name;
    private double salary;
    private double bonus;
    public Manager06() {
    }

    public Manager06(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void intro(){
        System.out.println("姓名:" + name + "工号:" + id);
    }
    public void showSalary(){
        System.out.println("薪水是:" + salary + "奖金:" + bonus);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码...");
    }
}
