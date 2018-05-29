package com.itheima.demo;

/**
 * 静态初始化int[] arr = {11, 22, 33, 44, 55}, 遍历arr数组
 * 编写步骤：
 *    1. 使用静态初始化int类型数组arr,内容为{11, 22, 33, 44, 55}
 *    2. 使用for循环遍历arr数组
 */
public class Test02 {

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
