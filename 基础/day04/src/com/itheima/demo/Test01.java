package com.itheima.demo;

/*
    第一题:语法练习
    1. 定义printEven方法,参数为(int n),返回值无
    2. 在printEven方法内使用for循环遍历获取1-n之间的所有整数,包括n
    3. 在for循环内判断该数字是否是偶数
    4. 如果是偶数,就打印这个数字
    5. 在main方法中调用printEven方法,参数传入20
* */
public class Test01 {
    public static void main(String[] args) {
        printEven(20);
    }

    public static void printEven(int n){
        for (int i = 2; i <= n; i+=2) {
            System.out.println("1-" + n + "之间的偶数是:" + i);
        }
    }

}
