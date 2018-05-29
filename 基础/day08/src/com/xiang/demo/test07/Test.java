package com.xiang.demo.test07;

import java.util.Scanner;

/**
 * 用户输入一个“QQ号码”，判断这个QQ号码是否正确 定义checkQQ (String qq)方法,checkQQ 方法内实现验
 * 证QQ号码是否正确 验证规则：
 * 1. 必须是5—12位数字
 * 2. 首位不能是0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个QQ号:");
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();

        System.out.println("这个QQ号码是否正确?" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq){
        if(qq.length() < 5 || qq.length() >12){  //判断长度不是5-12就返回false
            return false;
        }
        if(qq.indexOf("0") == 0){ //判断开始是否为0
            return false;
        }
        char[] chars = qq.toCharArray();
        for (int i = 0; i < chars.length; i++) { //循环判断每一个字符是否不是0-9
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
