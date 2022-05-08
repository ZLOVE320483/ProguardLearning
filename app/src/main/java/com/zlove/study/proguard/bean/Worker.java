package com.zlove.study.proguard.bean;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/11.
 * PS: Not easy to write code, please indicate.
 */
public class Worker extends BaseBean {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void printName() {
        System.out.println("----- " + name + " -----");
    }
}
