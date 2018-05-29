package com.itheima.expand;

import java.util.Scanner;

/**04
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是0-9的一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加由键盘输入控制
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.print("请输入相加的数量:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        sum(3,i);
    }
    public static void sum(int a,int count){
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            temp = temp*10+a; //存放a+aa+aaa+aaaa...
            sum += temp;  //总和
            System.out.print(temp);
            if(i==count-1) {
                System.out.print("");
            }else{
                System.out.print("+");
            }
        }
        System.out.println("="+sum);
    }
}
