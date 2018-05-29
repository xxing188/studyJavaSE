package com.itheima.expand;

import java.util.ArrayList;
import java.util.List;

/**
 * 要求：
 定义集合存放多个整数，打印集合中所有整数的和，最大值，最小值，偶数。
 */
public class Test44 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(14);
        list.add(9);

        System.out.println("集合:" + list);
        int sum = 0;
        int max = (int)list.get(0);
        int min = (int)list.get(0);
       // int even =
        System.out.print("偶数是:");
        for (int i = 0; i < list.size(); i++) {
            sum += (int)list.get(i);
            if(max < (int)list.get(i)){
                max = (int)list.get(i);
            }
            if(min>(int)list.get(i)){
                min = (int)list.get(i);
            }
            if((int)list.get(i)%2==0){
                System.out.print(list.get(i) + "  ");
            }
        }

        System.out.println("\n和是:" + sum);
        System.out.println("最大值是:" + max);
        System.out.println("最小值是:" + min);
    }
}
