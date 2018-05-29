package com.xiang.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book08> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Book08 b = new Book08();
            System.out.println("请录入第"+(i+1)+"本书名称:");
            b.setTitle(sc.next());

            System.out.println("请录入第"+(i+1)+"本书ISBN编码:");
            b.setIsbn(sc.next());

            System.out.println("请录入第"+(i+1)+"本书价格:");
            b.setPrice(sc.nextDouble());
            list.add(b);
        }

        for (int i = 0; i < list.size(); i++) {
            Book08 b = list.get(i);
            System.out.println("书名:"+b.getTitle()+",ISBN:"+b.getIsbn()+",价格:"+b.getPrice());
        }
    }
}
