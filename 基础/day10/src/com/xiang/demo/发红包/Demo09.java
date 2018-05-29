package com.xiang.demo.发红包;

public class Demo09 {
    public static void main(String[] args) {
        MyRedPacketFrame frame = new MyRedPacketFrame("发红包了...");

        frame.setOwnerName("西瓜");
//        frame.setOpenWay(new CommonWay());
        frame.setOpenWay(new LuckyWay());
    }
}
