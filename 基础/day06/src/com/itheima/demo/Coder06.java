package com.itheima.demo;

public class Coder06 {
    private String id;
    private String name;
    private double salary;

    public Coder06() {
    }

    public Coder06(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
        System.out.println("薪水是:" + salary);
    }
    public void work(){
        System.out.println("正在努力写代码...");
    }
}
