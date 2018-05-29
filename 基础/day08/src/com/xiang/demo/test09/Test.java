package com.xiang.demo.test09;

import java.util.ArrayList;

/**
 * 筛选字符串
 * 定义ArrayList集合，存入多个字符串
 * 删除ArrayList集合中长度大于4的字符串，打印删除后的集合
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("bca");
        arr.add("dadadf");
        arr.add("当扫单该死");
        arr.add("你好啊");
        arr.add("你在干嘛啊啊");
        arr.add("dadadfff");
        arr.add("当扫单该死");
        arr.add("别跑啊aa");
        arr.add("1234");
        System.out.println("源ArrayList:"+arr);

        for (int i = 0; i < arr.size() ; i++) {
            String s = arr.get(i);
            if(s.length() > 4){
                arr.remove(i);  //remove方法删掉之后 size直接减掉了
                i = 0;
            }
        }
        System.out.println("删除后的ArrayList:" + arr);

    }
}
