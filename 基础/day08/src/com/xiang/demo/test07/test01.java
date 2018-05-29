package com.xiang.demo.test07;

import java.util.Scanner;


/**
 * 用户输入一个“QQ号码”，判断这个QQ号码是否正确 定义checkQQ (String qq)方法,checkQQ 方法内实现验
 * 证QQ号码是否正确 验证规则：
 * 1. 必须是5—12位数字
 * 2. 首位不能是0
 */
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号");
        String qq = sc.next();
        System.out.println("输入的QQ是否正确:" + checkQQ(qq));

    }

    private static boolean checkQQ(String qq) {
        if (qq.length() < 5 || qq.length() > 12) {
            return false;
        }
        if (qq.indexOf('0') == 0) {
            return false;
        }
        char[] chars = qq.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
