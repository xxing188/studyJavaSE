package com.xiang.demo.test01.收发红包;

import java.util.ArrayList;
import java.util.Random;

public class QunZhu extends User {
    public QunZhu() {
    }

    public QunZhu(String name, double money) {
        super(name, money);
    }

    /**
     *
     * @param money 发多少钱
     * @param count 发多少份
     * @return
     */
    public ArrayList<Double> faHongBao(double money,int count){
        ArrayList<Double> hongBao = new ArrayList<>();
        double avgMoney = money/count;

        Random r = new Random();
        double v = r.nextDouble();


        for (int i = 0; i < count; i++) {
            hongBao.add(avgMoney);
        }
        setMoney(getMoney()-money); //发红包之后减少余额
        return hongBao;
    }
}
