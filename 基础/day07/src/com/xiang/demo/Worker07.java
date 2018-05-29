package com.xiang.demo;

import java.util.ArrayList;

public class Worker07 {
    private String id;
    private String name;
    private int age;

    public Worker07() {
    }

    public Worker07(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public static void maxAgeWoker( ArrayList<Worker07> list){
        Worker07 maxAgeWorker = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(maxAgeWorker.getAge()<list.get(i).getAge()){
                maxAgeWorker = list.get(i);

            }
        }
        maxAgeWorker.show();
    }
    public void show(){
        System.out.println(id + "," + name + "," + age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
