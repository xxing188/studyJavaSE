package com.xiang.demo.test01;

/**
 * 请使用任意3种构造方法创建3个字符串,并输出字符串对象的内容
 */
public class test {
    public static void main(String[] args) {
        String str = new String("你好");
        System.out.println("str" + str);

        byte[] b = {97,99,100,66,68};
        String str1 = new String(b);
        System.out.println("str1:" + str1);

        char[] c = {'h','e','l','l','o'};
        String str2 = new String(c);
        System.out.println("str2:" + str2);
    }
}
