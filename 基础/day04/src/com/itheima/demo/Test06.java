package com.itheima.demo;

/*
    第六题:
    定义printX方法，打印任意行的图形。
    代码实现，效果如图所示：
    开发提示：
    参考之前的练习，将代码抽取为一个方法。
 */
public class Test06 {
    public static void main(String[] args) {
        printX(10);

    }
    public static void printX(int count){
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if(j==i || i+j==count+1){  //   j==10-5+1
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
