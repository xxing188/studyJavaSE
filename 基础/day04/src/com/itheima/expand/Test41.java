package com.itheima.expand;

import java.util.ArrayList;

/**
 * 41
 * 1、定义一个int数组：｛32，123，6，23，65｝
 * <p>
 * 2、要求在这个数组索引为2的位置上，插入1整数00，生成一个新的数组如下：
 * ｛32，123，100，6，23，65｝
 * <p>
 * 3、把这个新数组的平均值打印出来
 */
public class Test41 {
    public static void main(String[] args) {
        int[] arr ={32,123,6,23,65};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i==2){
                list.add(100);
            }
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
