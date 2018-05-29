package com.xiang.expand;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。
 *
 */
public class Test24 {
    public static void main(String[] args) {
        System.out.println("1000以内的完数:");
        int number = 0;
        for (int i = 0; number < 1000; i++) {
            number = number + i;
            if(number>1000){
                break;
            }
            System.out.print(number + " ");  //0 1 3 6 10 15 21 28 36 45 55 66 ....
        }
    }
}
