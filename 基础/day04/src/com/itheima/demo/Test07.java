package com.itheima.demo;

/*
    第七题:
    定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
    代码实现，效果如图所示：
    开发提示：
    round方法中，参数+0.5后，转换为int类型，并返回。
 */
public class Test07 {
    public static void main(String[] args) {
        double d = 123.6;
        int round = round(d);
        System.out.println(d+"--->"+round);
    }
    public static int round(double d){
        double j = d*10;    //将小数乘于10
        int i = (int)j;
        if(i%10>=5){        //判断小数位是否大于等于五,大于就加进位
            i = (int)d+1;
        }else{
            i=(int)d;
        }
        return i;
    }
}
