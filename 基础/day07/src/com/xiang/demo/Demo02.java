package com.xiang.demo;

import java.util.Scanner;

/**
 * 键盘录入三个数据,获取这三个数的最大值
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据:");
        int c = sc.nextInt();

        int temp = a > b ? a:b;
        int max = temp > c ? temp : c;

        System.out.println("三个数最大的是:" + max);
    }
}
