package com.xiang.demo.test08;

public class Test03 {
    public static void main(String[] args) {
        String str = "java扫范三嫂反对祭java扫蓝开发java案件扫风骚法律java";
        String getStr = "java";


        String replace = str.replace(getStr, "*");
        int count = 0;
        for (int i = 0; i < replace.length(); i++) {
            if(replace.charAt(i)=='*'){
                 count ++;
            }
        }
        System.out.println(count);

    }
}
