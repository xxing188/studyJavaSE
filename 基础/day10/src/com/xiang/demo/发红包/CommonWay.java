package com.xiang.demo.发红包;


import java.util.ArrayList;

public class CommonWay implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 创建保存各个红包金额的集合
        ArrayList<Integer> list = new ArrayList<>();

        // 计算平均金额
        int avgMoney = totalMoney / count;

        // 设置前面count-1个人都是平均的金额
        for (int i = 0; i < count - 1; i++) {
            list.add(avgMoney);

            // 从总金额中减去已分配的金额,就是最后一个人剩余的金额
            totalMoney -= avgMoney;
        }

        // 将剩余的金额设置给最后一个人
        list.add(totalMoney);

        return list;
    }
}
