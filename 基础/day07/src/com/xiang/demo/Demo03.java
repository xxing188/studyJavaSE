package com.xiang.demo;

import java.util.Random;

/**
 * 获取5个大于等于1小于等于10之间的随机整数，并在控制台打印输出
 */
public class Demo03 {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            int j = rd.nextInt(10) + 1;
            System.out.println(j);
        }
    }
}
