package com.xiang.demo.test04;

public class Test {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        op.setName("旧手机");
        op.call();
        op.sendMessage();

        NewPhone np = new NewPhone();
        np.setName("新手机");
        np.call();
        np.sendMessage();

        np.playGame();
    }
}
