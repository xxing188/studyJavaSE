package com.xiang.demo;

/**
 * 定义数组int[] nums = {5,10,15},创建一个新数组,新数组元素的值是nums数组元素的2倍
 * 编写步骤：
 *  1. 定义数组int[] nums = {5,10,15}
 *  2. 创建一个int类型的新数组newArr，新数组的长度和nums数组长度相同
 *  3. 使用for循环遍历nums数组
 *  4. 在for循环中取出nums数组中的索引为i的元素,将索引为i的元素*2再赋值到新数组newArr对应的索引位
 *  5. 遍历输出nums数组中的元素
 */
public class Test03 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] newArr = new int[nums.length];

        System.out.println("nums数组:");
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i]*2;
            System.out.print(nums[i] +" ");
        }
        System.out.println("\nnewArr数组:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "  ");
        }

    }
}
