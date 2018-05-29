package com.itheima.demo;

import javax.sound.midi.Soundbank;

public class MyDate07 {
    private int year;
    private int month;
    private int day;

    public MyDate07() {
    }

    public MyDate07(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate(){
        System.out.println("日期:"+ year + "年" + month + "月" + day + "日");
    }
    public void isBi(){
        if((year%100 != 0 && year%4==0) || year%100==0 && year%400 == 0 ){
            System.out.println(year + "年是闰年!");
        }else{
            System.out.println(year + "年不是闰年!");
        }
    }
}
