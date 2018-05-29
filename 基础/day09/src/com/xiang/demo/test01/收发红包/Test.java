package com.xiang.demo.test01.收发红包;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        QunZhu qz = new QunZhu("张三",200);
        qz.show();

        Member m1 = new Member("李四",20);
        m1.show();
        Member m2 = new Member("李五",30);
        m2.show();
        Member m3 = new Member("李六",25);
        m3.show();
        System.out.println("---------");
        ArrayList<Double> hongBao = qz.faHongBao(3, 3);
        qz.show();

        m1.shouHongBao(hongBao);
        m1.show();
        m2.shouHongBao(hongBao);
        m2.show();
        m3.shouHongBao(hongBao);
        m3.show();

    }
}
