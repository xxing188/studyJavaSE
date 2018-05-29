package com.itheima.expand;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 40
 * <p>
 * 3、给长度为 10的整数数组键盘录入值（int范围以内），录入完毕后打印录入结果，格式如下：
 * 如果键盘录入2,1,3,5,7,6,9,10,8,4 ，则输出：您的数组为：{2,1,3,5,7,6,9,10,8,4},其中奇数5个，偶数5个。
 */
public class Test40 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i+1)+"个数:");
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("你的数组" + Arrays.toString(arr) + "奇数有" + oddCount + "个,偶数有" + evenCount + "个");
    }
}
