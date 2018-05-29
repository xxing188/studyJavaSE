package com.xiang.demo;

/**
 * 有一个编程比赛,有5个评委给选手打分.取消最高分和最低分后的平均分就是这个选手的最后得分,这5个评委的
 * 评分为:{99, 100, 98, 97, 96};
 *
 * 开发提示：
 * 找出最高分和最低分
 * 计算出总分
 * 平均分 = (5个评委的分数-最高分-最低分) / 人数
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = {99,100,98,97,96};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("最终得分:" + avg);
    }
}
