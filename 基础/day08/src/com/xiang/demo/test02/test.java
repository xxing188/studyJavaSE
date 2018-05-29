package com.xiang.demo.test02;

/**
 * 练习字符串的判断功能,有如下代码
 */
public class test {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";
        //1. 比较str1和str2内容是否相等,比较str1和str3内容是否相等
        System.out.println("str1和str2内容是否相等:" + str1.equals(str2));
        System.out.println("str1和str3内容是否相等:" + str1.equals(str3));

        //2. 忽略大小写比较str1和str3内容是否相等
        System.out.println("忽略大小写比较str1和str3内容是否相等:" + str1.equalsIgnoreCase(str3));

        //3. 测试str1字符串是否以"He"前缀开头,测试str1字符串是否以"abc"前缀开头
        System.out.println("str1字符串是否以He前缀开头" + str1.startsWith("He"));
        System.out.println("str1字符串是否以abc前缀开头" + str1.startsWith("abc"));

        //4 测试str1字符串是否以"o"后缀结尾,测试str1字符串是否以"l"后缀结尾
        System.out.println("str1字符串是否以o后缀结尾" + str1.endsWith("o"));
        System.out.println("str1字符串是否以l后缀结尾" + str1.endsWith("l"));
    }
}
