package com.xiang.demo;

/**
 * 选择题答案评分
 * 5道单项选择题，标准答案为 ：【ADBCD】
 * 四名同学答案分别为：
 * 小传：【DCBAD】
 * 小智：【ADBCD】
 * 小播：【ADBCA】
 * 小客：【ABCDD】
 * 给这4名同学评分,答对一道题给2分
 */
public class Test08 {
    public static void main(String[] args) {
        char[] answer = {'A','D','B','C','D'};  //标准答案

        char[] xc = {'D','C','B','A','D'};
        char[] xz = {'A','D','B','C','D'};
        char[] xb = {'A','D','B','C','A'};
        char[] xk = {'A','B','C','D','D'};

        grade("小传",xc,answer);
        grade("小智",xz,answer);
        grade("小播",xb,answer);
        grade("小客",xk,answer);

    }

    /**
     *  @param name 学生姓名
     * @param c 学生答题
     * @param answer 正确答案
     *
     */
    public static void grade(String name, char[] c,char[] answer){
        int score = 0;
        for (int i = 0; i < answer.length; i++) {
            if(c[i]==answer[i]){
                score += 2;
            }
        }
        System.out.println("满分10分,"+ name +":得分:" + score + "分");
    }

}
