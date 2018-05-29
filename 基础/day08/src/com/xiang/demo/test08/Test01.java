package com.xiang.demo.test08;

public class Test01 {
    public static void main(String[] args) {
        String str = "asdfsfkjafdfsdjavasdfjavafsdfajavasfsdfsjavaxzc";
        String ch = "java";
        int java = str.indexOf(ch);
        int count = 0;
        while(str.indexOf(ch) != -1) {
            int sub = str.indexOf(ch)+ch.length();
            str = str.substring(sub);
            System.out.println(str);
            count++;
        }
        System.out.println(count + "次");
    }
}
