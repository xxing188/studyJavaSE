package com.xiang.demo;

/*
    第四题:
    1. 定义getChar方法,参数为(int num),返回值char类型
    2. 在getChar方法中,将传入的参数num转成char类型变量ch
    3. 在getChar方法中判断chs是否是小写字母.如果是返回ch
    4. 在getChar方法中判断chs是否是大写字母.如果是返回ch
    5. 在getChar方法中判断chs是否是数字字符.如果是返回ch
    6. 其他情况返回' '
    7. 在main方法中调用getChar方法,传入一个数字.使用aChar变量接收getChar方法的返回值
 */
public class Test04 {
    public static void main(String[] args) {
        char aChar = getChar(49);
        System.out.println("字符:" + aChar);
    }

    public static char getChar(int num){
        char ch  ;
        if(num>=65 && num <= 90){  //65-90 返回字母A-Z
            ch = (char) num;
        }else if(num>=97 && num<=122){  //97-122 返回字母a-z
            ch = (char) num;
        }else if(num >=48 && num <=57){ //48-57 返回数字0-9
            ch = (char) num;
        }else{
            ch = ' ';
        }
        return ch;
    }
}
