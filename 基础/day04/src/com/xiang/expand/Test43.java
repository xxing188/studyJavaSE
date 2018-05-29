package com.xiang.expand;

/**
 * 1、定义一个方法 public static  long  pow(int a,  int  b)
 * <p>
 * 2、要求方法返回 a 的 b次方
 */
public class Test43 {
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }

    public static  int  pow(int a,  int  b){
        int c=a;
        for (int i = 1; i < b; i++) {
            c = a * c;
        }
        return c;
    }
}
