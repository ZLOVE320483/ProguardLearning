package com.zlove.study.proguard.utils;

import com.zlove.study.proguard.bean.Worker;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/12.
 * PS: Not easy to write code, please indicate.
 */
public class GenerateWorkerFactory {

    public static Worker generateWorker() {
        Worker worker = new Worker();
        worker.setName("zlove.zhang");
        worker.setAge(25);
        return worker;
    }
}
