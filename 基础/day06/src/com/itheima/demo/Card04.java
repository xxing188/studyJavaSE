package com.itheima.demo;

public class Card04 {
    private String huase;
    private char point;

    public String getHuase() {
        return huase;
    }

    public void setHuase(String huase) {
        this.huase = huase;
    }

    public char getPoint() {
        return point;
    }

    public void setPoint(char point) {
        this.point = point;
    }

    public Card04(String huase, char point) {
        this.huase = huase;
        this.point = point;
    }

    public void showCard(){
        System.out.println(huase + point);
    }
}
