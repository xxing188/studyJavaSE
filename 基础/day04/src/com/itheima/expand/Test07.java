package com.itheima.expand;

/**
 * 盒子里有3个红球，4个绿球，5个白球，总共取5个球.编程求所有的取球方案
 */
public class Test07 {
    public static void main(String[] args) {
        char[][] c1 = {{'红','红','红'},{'绿','绿','绿','绿'},{'白','白','白','白','白'}};

        int[][] a1 = {{ 1, 2, 3, }, { 4, 88, 6, },{ 7, 8, 9, },};

        for (int i = 0; i < a1.length; i++) {
            for (int i1 = 0; i1 < a1[i].length; i1++) {
                System.out.println(a1[i][i1]);
            }
        }
    }

}
