package com.xiang.demo;

import java.util.ArrayList;

public class Demo07 {
    public static void main(String[] args) {
        Worker07 w1 = new Worker07("bz001","黄渤",47);
        Worker07 w2 = new Worker07("bz002","孙红雷",48);
        Worker07 w3 = new Worker07("bz003","罗志祥",35);

        ArrayList<Worker07> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);

        System.out.println("最高年龄的是:");
        Worker07.maxAgeWoker(list);
    }

}
