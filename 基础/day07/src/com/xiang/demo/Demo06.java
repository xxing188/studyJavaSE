package com.xiang.demo;

import java.util.ArrayList;

public class Demo06 {
    public static void main(String[] args) {
        Teacher06 t1 = new Teacher06("姚小明", 23, "打篮球");
        Teacher06 t2 = new Teacher06("景甜", 20, "打羽毛球");
        Teacher06 t3 = new Teacher06("薛之谦", 45, "踢足球");

        ArrayList<Teacher06> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        for (int i = 0; i < list.size(); i++) {
            Teacher06 t = list.get(i);
            t.show();
        }
        System.out.println("-------------------");
        for (int i = 0; i < list.size(); i++) {
            Teacher06 t = list.get(i);
            if (t.getAge() > 40) {
                t.setLike("打高尔夫");
                t.show();
            }
        }

    }
}
