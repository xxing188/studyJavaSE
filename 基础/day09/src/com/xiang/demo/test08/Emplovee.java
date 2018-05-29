package com.xiang.demo.test08;

/**
 * 员工
 */
public abstract class Emplovee {
    private String id;
    private String name;

    public Emplovee() {
    }

    public Emplovee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public abstract void work();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
