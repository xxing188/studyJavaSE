package com.xiang.demo.test08;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setId("g100001");
        fruit.setName("苹果");
        fruit.setPrice(5);

        Laptop laptop = new Laptop();
        laptop.setId("g100002");
        laptop.setName("笔记本");
        laptop.setPrice(3980);

        Phone phone = new Phone();
        phone.setId("g100002");
        phone.setName("手机");
        phone.setPrice(5500);

        System.out.println("|==========添加商品=============");
        GouWuChe gouWuChe = new GouWuChe();
        gouWuChe.add(fruit);
        gouWuChe.add(laptop);
        gouWuChe.add(phone);

        System.out.println("|==========打印商品=============");
        gouWuChe.show(gouWuChe);
        System.out.println("|------------------");

        double price = gouWuChe.total(gouWuChe);
        System.out.println("|原 价 为:" + price + "\t\t\t\t");
        System.out.println("|折扣价为:" + (price*0.88) + "\t\t\t\t");

    }
}
