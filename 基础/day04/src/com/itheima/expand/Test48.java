package com.itheima.expand;

/**
 * 打印1--100之间的所有数字，将数字中包含8的进行相加计算。最后打印结果
 */
public class Test48 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            int ge = i%10;
            if(ge==8){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("和是:"+sum);
    }
}
