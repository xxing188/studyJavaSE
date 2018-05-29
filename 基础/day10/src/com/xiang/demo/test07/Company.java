package com.xiang.demo.test07;

public class Company implements Money {
    private double fund;

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    @Override
    public void paySalary(Employee employee) {
        setFund(fund-employee.getSalary()); //设置发工资后余额
        System.out.println("给" + employee.getName() + "发工资" + employee.getSalary() + "元,公司剩余:"+ getFund() +"元");
    }
}
