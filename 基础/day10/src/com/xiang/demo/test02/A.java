package com.xiang.demo.test02;

public interface A {
    void showA();
    default void showB(){
        System.out.println("BBBBB");
    }
}
