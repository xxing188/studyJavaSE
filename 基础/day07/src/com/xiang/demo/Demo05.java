package com.xiang.demo;

import java.util.ArrayList;

/**
 * 自定义学生类存储到ArrayList集合,并操作集合
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Student05> list = new ArrayList<>();
        Student05 s1 = new Student05("it001","张三",1.78);
        Student05 s2 = new Student05("it002","李四",1.56);
        Student05 s3 = new Student05("it003","黄渤",1.60);
        Student05 s4 = new Student05("it004","王五",1.72);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println("集合大小:" +list.size());
        ArrayList<Student05> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student05 stu = list.get(i);
            System.out.println(stu.getId()+"," + stu.getName() + "," + stu.getHeight());
            if(stu.getHeight() > 1.7){
                list2.add(list.get(i));
            }
        }

        System.out.println("------------------------");
        for (int i = 0; i < list2.size(); i++) {
            Student05 stu = list2.get(i);
            System.out.println(stu.getId()+"," + stu.getName() + "," + stu.getHeight());
        }
    }
}
