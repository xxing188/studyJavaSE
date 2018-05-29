package com.xiang.demo.test06;

import java.util.Scanner;

/**
 * 请编写程序，将键盘录入的字符串中敏感字符过滤掉，并测试
 例如敏感字： 奥巴马
 键盘输入: 我喜欢奥巴马呀，还喜欢普京
 打印输出: 我喜欢*呀，还喜欢普京
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "奥巴马";//要过滤字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String next = sc.next();
        String replace = next.replace(str, "***");
        System.out.println(replace);
    }
}
