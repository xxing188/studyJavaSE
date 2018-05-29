package com.xiang.demo.test02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }


}

class B implements A {
    @Override
    public void showA() {
        System.out.println("AAAA");
    }
}
