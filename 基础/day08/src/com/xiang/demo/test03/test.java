package com.xiang.demo.test03;

/**
 * 练习字符串的获取功能方法,有如下代码
 */
public class test {

    public static final double DOUBLE = 5.;

    public static void main(String[] args) {
        String str = "HelloWorld广州";
        // 1. 获取str字符串的长度
        System.out.println("str字符串的长度:" + str.length());

        // 2. 获取str字符串索引为2的char值
        System.out.println("str字符串索引为2的char值:" + str.charAt(2));

        // 3. 获取字符串"o"第一次出现在该字符串内的索引
        System.out.println("字符串o第一次出现在该字符串内的索引" + str.indexOf("o"));

        // 4. 截取字符串str,从索引6开始到结束
        System.out.println("截取字符串str,从索引6开始到结束:" + str.substring(6));

        // 5.截取字符串str,从索引2开始到索引7(不包含所以7)
        System.out.println("截取字符串str,从索引2开始到索引7:" + str.substring(2, 7));
    }
}
