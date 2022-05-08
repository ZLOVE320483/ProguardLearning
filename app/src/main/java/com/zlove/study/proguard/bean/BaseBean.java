package com.zlove.study.proguard.bean;

import androidx.annotation.Keep;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2022/4/15.
 */
public abstract class BaseBean {

    @Keep
    public abstract void printName();

    public void printAge() {
    }
}
