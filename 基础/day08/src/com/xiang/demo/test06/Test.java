package com.xiang.demo.test06;

import java.util.Scanner;

/**
 * 请编写程序，将键盘录入的字符串中敏感字符过滤掉，并测试
   例如敏感字： 奥巴马
   键盘输入: 我喜欢奥巴马呀，还喜欢普京
   打印输出: 我喜欢*呀，还喜欢普京
 */
public class Test {
    public static void main(String[] args) {
        // 1. 定义一个String变量mgc,保存敏感词: "奥巴马"
        String mgc = "奥巴马";

        // 2. 创建Scanner对象
        Scanner sc = new Scanner(System.in);

        // 3. 提示用户输入一个字符串
        System.out.println("请输入一个字符串:");

        // 4. 使用Scanner的next方法录入一个字符串
        String str = sc.next();

        // 5. 使用replace方法,将键盘输入字符串中的敏感词替换成"*"
        String newStr = str.replace(mgc, "***");

        // 6. 打印出替换后的字符串
        System.out.println(newStr);
    }
}
