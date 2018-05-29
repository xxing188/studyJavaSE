package com.xiang.demo.test04;

public class NewPhone implements Play {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call(){
        System.out.println(name + "打电话");
    }
    public  void sendMessage(){
        System.out.println( name + "发短信");
    }

    @Override
    public void playGame() {
        System.out.println( name + "玩游戏");
    }
}
