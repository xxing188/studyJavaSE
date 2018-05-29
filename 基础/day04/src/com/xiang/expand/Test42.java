package com.xiang.expand;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、定义一个int数组｛32,32，6，6，65｝
 * <p>
 * 2、把这个数组中那些唯一的数字，放到一个新的数组中，生成的新数组如下：
 * ｛32，6，65｝
 */
public class Test42 {
    public static void main(String[] args) {
        int[] arr = {32,32,6,6,65};
        int[] newArr = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //System.out.print(arr[i] + " ");
                if(arr[i] == arr[j]){
                    j = ++i;
                }
            }
            System.out.println("arr:" + arr[i]);
            //newArr[i] = arr[i];
            list.add(arr[i]);
           // System.out.println();
        }

            System.out.println("新数组:"+ list);
    }
}
