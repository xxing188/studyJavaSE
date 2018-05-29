package com.xiang.expand;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //系统自定义6个红球和1个蓝球  (数组和变量)
        int[] redBall = {9, 16, 17, 24, 30, 31};//红球
        int blueBall = 4;      //蓝球
        Scanner scanner = new Scanner(System.in);

        //接收用户输入的数(红球1-33)(蓝球1-16)
        System.out.println("请输入红球(1-33):");
        try {
            int[] arrays = new int[6];
            for (int i = 0; i < 6; i++) {
                arrays[i] = scanner.nextInt();
                if (arrays[i] > 33 || arrays[i] < 1) {
                    System.out.println("输入非法!请重新输入");
                    i = i - 1;
                    //continue flag;  //输入错误跳转到标签继续循环
                }
            }

            int i1 = 0; //蓝球
            for (int i = 0; i < 1; i++) {
                System.out.println("请输入蓝球(1-16):");
                i1 = scanner.nextInt();  //接收蓝球输入
                if (i1 > 16 || i1 < 1) {
                    System.out.println("输入非法!请重新输入!");
                    i = i -1;   //输入错误则返回继续循环
                }
            }

            //比对用户录入的号码  需要有一个变量记录正确了几个

            int count = 0;  //记录数量
            for (int i = 0; i < redBall.length; i++) { //循环从系统值拿出来和输入值比较
                for (int j = 0; j < arrays.length; j++) {
                    if (redBall[i] == arrays[j]) {
                        count++;
                    }
                }
            }
  System.out.println("红球匹配" + count + "个");
            //输出用户中奖情况
            if (count == 6 && blueBall == i1) {
                System.out.println("一等奖");
            } else if (count == 5 && blueBall == i1) {
                System.out.println("二等奖");
            } else if ((count == 3 || count == 4) && blueBall == i1) {
                System.out.println("三等奖");
            } else if (count == 1 && blueBall == i1) {
                System.out.println("四等奖");
            } else {
                System.out.println("没有中奖!");
            }
        }catch (Exception e){
            System.out.println("输入非数字字符");
        }finally {
            scanner.close();
        }
    }
}
