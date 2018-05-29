package com.xiang.expand;

/**
 * 打印一个空心菱形,菱形的行数由键盘控制
 */
public class Test05 {
    public static void main(String[] args) {
        //print(9);
        p(9);
    }
    public static void print(int count){
            if(count%2!=0){
                count = count/2+1;
            }else{
                count = count/2;
            }
System.out.println(count);
        for (int i = 1; i < count+1; i++) {
            for (int a=1;a<=count-i;a++){
                System.out.print(" ");
            }
            for (int j = 1; j < i*2+1; j++) {
                if(j==1 || j==i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = count; i >=1; i--) {
            for (int a=1;a<=count-i;a++){
                System.out.print(" ");
            }
            for (int j = 1; j < i*2+1; j++) {
                if(j==1 || j==i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void p(int count){
        for(int i = 1; i <= count; i++){   //i=1 j=5
            for(int j = 1; j <= count; j++){
                if(count-j==i+3 || i + j == count+5 || i - j == count-5 || j - i ==count-5){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
