package com.zlove.study.proguard.utils;

import com.zlove.study.proguard.bean.Person;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/7.
 * PS: Not easy to write code, please indicate.
 */
public class ShrinkUtils {

    public static Person generatePerson() {
        Person person = new Person();
        person.setAge(20, "zlove");
        return person;
    }
}
