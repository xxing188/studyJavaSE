package com.itheima.demo;

/*
    第九题:
    打印九九乘法表

 */
public class Test09 {
    public static void main(String[] args) {
        print99();
    }
    public static void print99 (){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" +j*i + "\t");
            }
            System.out.println();
        }
    }
}
