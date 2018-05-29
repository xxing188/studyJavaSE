package com.xiang.demo.test09;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义ArrayList集合，存入多个字符串
 * 删除ArrayList集合中长度大于4的字符串，打印删除后的集合
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("abcde");
        list.add("哈哈");
        list.add("呵呵");
        list.add("hadfadfa");
        list.add("扫发骚发送");
        list.add("复活甲他啊");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > 4){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        
    }
}
