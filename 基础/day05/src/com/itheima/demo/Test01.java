package com.itheima.demo;


public class Test01 {
    public static void main(String[] args) {
     int[] arr = {12,33,3,6,16};
     int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}


