package com.xiang.demo.test08;

public class Test02 {
    public static void main(String[] args) {
        String str = "java扫范三嫂反对祭扫蓝开发java案件扫风骚法律java";
        String getStr = "java";

    }

    /**
     * 在一个字符串中查找指定字符串
     * @param str 传入字符串
     * @param getStr 要查询的字符串
     * @return
     */
    private int getCount(String str,String getStr){
        int count = 0;
        while (str.indexOf(getStr) != -1){  //指定字符第一次出现的字符串内的索引为-1说明没有查到
            str = str.substring(str.indexOf(getStr) + getStr.length());//从字符串开始的位置截取
            count++;
        }
       return count;
    }
}
