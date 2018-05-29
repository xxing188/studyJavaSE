package com.xiang.demo.test04;

/**
 * 练习转换功能方法,有如下代码:

 */
public class Test {
    public static void main(String[] args) {
        String str = "HelloWorld";
        // 1. 将str字符串转换为字符数组,并遍历字符数组,输出每个字符
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        // 2. 将str字符串转换为小写
        System.out.println("将str字符串转换为小写:" + str.toLowerCase());

        // 3. 将str字符串转换为大写
        System.out.println("将str字符串转换为大写:" + str.toUpperCase());

        // 4. 将str字符串中的字符'o'替换成'6'
        System.out.println("将str字符串中的字符'o'替换成'6:" + str.replace("o", "6"));

        // 5. 将str字符串中的字符串"ll"替换成"LL"
        System.out.println("将str字符串中的字符串ll替换成LL:" + str.replace("ll", "LL"));
    }
}
