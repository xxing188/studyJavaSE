package com.itheima.expand;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 求两个int数组里面的元素是否完全相等
 */
public class Test50 {

    public static void main(String[] args) {
        int[] arr1 = {32, 23, 33, 12, 14, 16};
        int[] arr2 = {32, 23, 33, 12, 14, 16};
        //Arrays.equals(arr1,arr2);
        System.out.println(equals(arr1, arr2));
    }

    /**
     *
     * @param a
     * @param a1
     * @return
     */
    private static boolean equals(int[] a, int[] a1){
        int i = a.length;
        if(a1.length != a.length){
            return false;
        }
        for (int i1 = 0; i1 < i; i1++) {
            if(a[i1] != a[i1]){
                return false;
            }
        }
        return true;
    }

}
