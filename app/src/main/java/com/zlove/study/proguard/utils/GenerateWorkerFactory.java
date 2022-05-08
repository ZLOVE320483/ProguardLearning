package com.zlove.study.proguard.utils;

import com.zlove.study.proguard.bean.Worker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/12.
 * PS: Not easy to write code, please indicate.
 */
public class GenerateWorkerFactory {

    private static final String json = "{\"name\": \"zlove.zhang\",\"age\": 18}";

    public static Worker generateWorker() {
        try {
            JSONObject object = new JSONObject(json);
            Worker worker = new Worker();
            worker.setName(object.optString("name"));
            worker.setAge(object.optInt("age"));
            return worker;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
