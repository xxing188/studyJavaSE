package com.xiang.demo.test01.收发红包;

import java.util.ArrayList;

public class Member extends User {
    public Member() {
    }

    public Member(String name, double money) {
        super(name, money);
    }

    public void shouHongBao(ArrayList<Double> hongbao){
        Double money = hongbao.remove(0); //拆开一个红包得到的钱
        setMoney(getMoney()+money); //设置余额=原有余额+得到的一个红包
    }
}
