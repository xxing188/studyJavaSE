package com.xiang.expand;

/**
 * 06
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Test06 {
    public static void main(String[] args) {
        //
        double d = 100;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            d = d/2;
            sum += d;
            System.out.println("第"+ i +"次反弹:" + d + "米");
        }
        System.out.println("十次共经过"+(sum+100) + "米");
    }
}
