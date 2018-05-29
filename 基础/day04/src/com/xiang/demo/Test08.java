package com.xiang.demo;

/*
    第八题:
    温度转换：摄氏度与华氏度的相互转换。
    代码实现，效果如图所示：
    开发提示：
    转换公式：
    华氏度=(9.0/5)*摄氏度+32

 */
public class Test08 {
    public static void main(String[] args) {
        wendu(30);
    }
    public static void wendu (double d){
        double huashi = (9.0/5)*d+32;//华氏度
        double sheshi= (huashi-32)/(9.0/5); //摄氏度
        System.out.println("摄氏度为:" + sheshi +"℃--华氏度为:" + huashi + "℉");
        System.out.println("华氏度为:" + huashi +"℉--摄氏度为:" + sheshi + "℃");
    }
}
