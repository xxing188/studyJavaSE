package com.itheima.expand;

/**
 * 定义3个重载方法，求2个，3个，4个整数的平均数 并分别在main方法中调用
 */
public class Test45 {
    public static void main(String[] args) {
        System.out.println("两个数的平均数:" + avg(10,12));
        System.out.println("三个数的平均数:" + avg(12,14,16));
        System.out.println("四个数的平均数:" + avg(12,14,16,18));
    }

    public  static int avg(int a,int b){
        int avg = (a+b)/2;
        return avg;
    }
    public  static int avg(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public  static int avg(int a,int b,int c,int d){
        int avg = (a+b+c+d)/4;
        return avg;
    }
}
