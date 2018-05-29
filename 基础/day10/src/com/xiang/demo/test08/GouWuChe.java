package com.xiang.demo.test08;

import java.util.ArrayList;

/**
 * 购物车
 */
public class GouWuChe {
    private ArrayList<Goods> list = new ArrayList<>();

    public ArrayList<Goods> getList() {
        return list;
    }

    public void setList(ArrayList<Goods> list) {
        this.list = list;
    }

    public void add(Goods goods){
        System.out.println("|加入" + goods.getName() + "成功");
        list.add(goods);
    }
    public void show(GouWuChe gouWuChe){
        System.out.println("|您选购的商品为:\t\t\t\t");
        for (int i = 0; i < gouWuChe.list.size(); i++) {
            Goods goods = gouWuChe.list.get(i);
            System.out.println("|\t" + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }

    /**
     *
     * @param gouWuChe 购物车
     * @return 总价
     */
    public double total(GouWuChe gouWuChe){
        double price = 0;
        for (int i = 0; i < gouWuChe.list.size(); i++) {
            Goods goods = gouWuChe.list.get(i);
            price += goods.getPrice();
        }
        return price;
    }

}
