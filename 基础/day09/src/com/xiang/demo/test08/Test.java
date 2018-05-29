package com.xiang.demo.test08;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("666","傅红雪");
        l.work();

        Tutor t = new Tutor("778","古琦");
        t.work();

        Maintainer m = new Maintainer("999","刘备");
        m.work();

        Buyer b = new Buyer("456","景甜");
        b.work();

    }
}
