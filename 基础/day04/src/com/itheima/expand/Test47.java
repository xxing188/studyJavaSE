package com.itheima.expand;

/**
 * * 一、定义一个数组，元素有：{88,55,77,33,66,44};
 * 1、定义一个方法，求出数组中的最大值
 * 2、定义一个方法，将数组中的内容反转
 * 3、定义一个方法，将数组中的所有元素进行求和
 */

public class Test47 {
    public static void main(String[] args) {
        int[] arr = {88, 55, 77, 33, 66, 44};

        System.out.println("数组最大值是:" + max(arr));
        reversal(arr);
        sum(arr);

    }

    //返回数组最大值
    private static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //数组反转
    private static void reversal(int[] arr){
        System.out.println("数组反转前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int stat=0,end=arr.length-1;stat>end;stat++,end--){
            int temp = arr[stat];
            arr[stat] = arr[end];
            arr[end] = temp;
        }

        System.out.println("\n数组反转后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    //数组求和
    private static void sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("该数组和是:" + sum);
    }
}
