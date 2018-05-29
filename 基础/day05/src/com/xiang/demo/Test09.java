package com.xiang.demo;

public class Test09 {
    public static void main(String[] args) {
        String[] str1={"黑桃","梅花","红桃","方片"};
        String[] str2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < str1.length; i++) {
                //System.out.print(str1[i]);
            for (int j = 0; j < str2.length; j++) {
                System.out.print(str1[i]+str2[j] + "\t");
            }
            System.out.println();
        }
    }
}
