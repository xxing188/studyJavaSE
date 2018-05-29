package com.itheima.expand;

import java.util.Scanner;

/*
    01 需求:使用键盘录入提示用户输入一个1和50之间的奇数,将用户输入的数累加求和,
	当和大于100时候则退出,不满足则继续提示用户输入,最后在控制台打印输出求得的总和。

	考核知识点:键盘录入对象、 while循环控制语句 、 if流程控制语句、计数器的使用、逻辑运算符、算数运算符、continue关键字的应用
	分析:
	第一步:创建键盘录入对象,提示用户输入
	第二步:定义计数器,将计数器和用户输入的数相加,通过使用循环控制控制输入次数,提示用户再次输入
	第三步:如果用户输入不合法则提示用户重新输入
	第四步：将求得的总和输出到控制台
 */
public class Test01 {
    public static void main(String[] args) {
        int sum = 0;
        while(true) {
            System.out.print("请输入一个1-50之间的奇数:");
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            if(sc%2!=0) {
                if(sc>50 || sc<1){
                    System.out.println("输入的数字不在1-50之间");
                    continue;
                }else {
                    for (int i = 1; i < sc; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                    if (sum > 100) {
                        System.out.println("大于100!退出程序");
                        break;
                    }else{
                        System.out.println("数字累加和不到100!");
                    }
                }
            }else{
                System.out.println("输入的数不是奇数!");
            }
        }
    }
}
