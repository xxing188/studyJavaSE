package com.xiang.demo.test08;

/**
 * 维护专员
 */
public class Maintainer extends Adminstaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为:"+getId()+" 的维护专员 " + getName() + " 在解决不能共享屏幕问题");
    }
}
