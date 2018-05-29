package com.xiang.expand;

import java.util.Scanner;

/**
 * 假设：
 * 哈佛大学的录取分数线是700 -- 800分之间
 * 牛津大学的录取分数线是600 -- 699分之间
 * 北京大学的录取分数线是500 -- 599分之间
 * 人民大学的录取分数线是400 -- 499分之间
 * 1、通过键盘录入学员分数，让该学员可以进入哈佛大学学习。
 */
public class Test49 {
    public static void main(String[] args) {
        System.out.print("请输入学员分数:");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score >= 700 && score <=800){
            System.out.println("恭喜分数达到哈佛大学录取标准");
        }else if(score >=600 && score <= 699){
            System.out.println("恭喜分数达到牛津大学录取标准");
        }else if(score >= 500 && score <=599){
            System.out.println("恭喜分数达到北京大学录取标准");
        }else if(score >=400 && score <=499){
            System.out.println("恭喜分数达到人民大学录取标准");
        }
    }
}
