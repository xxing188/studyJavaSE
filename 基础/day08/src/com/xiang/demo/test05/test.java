package com.xiang.demo.test05;

/**
 * 练习Math类的abs,ceil,floor,round方法
 */
public class test {
    public static void main(String[] args) {
        //1. 打印8的绝对值
        System.out.println("8的绝对值" + Math.abs(8));

        //2. 打印-9的绝对值
        System.out.println("-9的绝对值" + Math.abs(-9));

        //3. 打印6.1向上取整的值
        System.out.println("6.1向上取整的值:" + Math.ceil(6.1));

        //4. 打印-6.1向上取整的值
        System.out.println("-6.1向上取整的值:" + Math.ceil(-6.1));

        //5. 打印6.8向下取整的值
        System.out.println("6.8向下取整的值:" + Math.floor(6.8));

        //6. 打印-6.8向下取整的值
        System.out.println("-6.8向下取整的值:" + Math.floor(-6.8));

        //7. 打印5.88四舍五入的值
        System.out.println("5.88四舍五入的值:" + Math.round(5.88));

        //8. 打印-5.88四舍五入的值
        System.out.println("-5.88四舍五入的值:" + Math.round(-5.88));
    }
}
