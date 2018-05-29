package com.xiang.expand;

import java.util.Scanner;

/**
 * 需求:创建一个长度为5的浮点型数组,使用键盘录入五个数,分别赋值给这个数组,定义三个方法,
 * 方法一:求出这个数组的总和
 * 方法二:求出这个数组平均数
 * 方法三:求出这个数组的最小值
 */
public class Test02 {
    public static void main(String[] args) {
        /*
        * 分析：
            第一步：创建一个长度为5的浮点型数组
            第二步：使用键盘录入对象，通过循环依次录入五个数并赋值给数组
            第三步：定义求和方法
            第四步：定义求平均数方法
            第五步：定义求最小值方法
        * */
        System.out.println("请输入五个数:");
        Scanner scanner = new Scanner(System.in);
        double[] doubles = new double[5];
        for (int i=0;i<doubles.length;i++) {
            doubles[i] = scanner.nextDouble();
        }

        System.out.println("这个数组的和是:" + sum(doubles));
        System.out.println("这个数组的平均数是:" + avg(doubles));
        System.out.println("这个数组的最小值是:" + min(doubles));

    }
    //方法一:求出这个数组的总和
    public static double sum(double[] doubles){
        double sum = 0;
        for (int i = 0; i < doubles.length; i++) {
            sum +=doubles[i];
        }
        return sum;
    }

    //方法二:求出这个数组平均数
    public static double avg(double[] doubles){
        double avg = 0;
        for (int i = 0; i < doubles.length; i++) {
            avg += doubles[i];
        }
        avg /=doubles.length;
        return avg;
    }

    //方法三:求出这个数组的最小值
    public static double min(double[] doubles){
        double min=0;
        for (int i = 0; i < doubles.length; i++) {
            min = doubles[0];
            if(doubles[i]<min){
                min = doubles[i];
            }
        }
        return min;
    }
}
