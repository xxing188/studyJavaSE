package com.xiang.demo.test07;

public class Test {
    public static void main(String[] args) {


        Manager manager = new Manager();
        manager.setName("张蔷");
        manager.setSalary(9000);

        Coder coder = new Coder();
        coder.setName("李小狼");
        coder.setSalary(5000.3);

        Company c = new Company();
        c.setFund(1000000);
        c.paySalary(manager);
        c.paySalary(coder);
    }
}
