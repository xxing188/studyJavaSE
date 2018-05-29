package com.xiang.demo;

/**
 * 定义equals方法，比较2个数组内容是否完全一致。
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};
        //boolean isEquals = equals(arr1,arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

        System.out.println("\n是否一致:" + equals(arr1, arr2));

    }

    private static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) { //长度不一致直接返回false
            return false;
        }
        //循环比较内容
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }


}
