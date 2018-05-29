package com.itheima.demo;

/**
 * 判断数组中的元素是否对称.
 * 代码实现，效果如图所示：
 * 开发提示：
 * 数组中元素首尾比较
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 4, 3, 2, 1};
        boolean flag = true;
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            if (arr[start] != arr[end]) {
                flag = false;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i] + "\t");
        }

        System.out.println("是否对称?" + flag);
    }
}
