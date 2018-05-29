package com.xiang.demo.发红包;


import java.util.ArrayList;
import java.util.Random;

public class LuckyWay implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 创建保存各个红包金额的集合
        ArrayList<Integer> list = new ArrayList<>();

        // 定义循环次数,总个数-1次
        int time = count - 1;

        // 创建随机数对象
        Random ran = new Random();
        // 前面count - 1个红包是随机出来的,最后一个红包就是总金额-前面发了的哪些红包
        for (int i = 0; i < time; i++) {
            int avgMoney = totalMoney / count;

            int money = ran.nextInt(avgMoney * 2) + 1;
            list.add(money);
            totalMoney -= money;

            count--;
        }

        // 剩余的金额,为最后一个红包
        list.add(totalMoney);

        return list;
    }
}
