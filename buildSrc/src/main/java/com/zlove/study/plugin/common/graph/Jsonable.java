package com.zlove.study.plugin.common.graph;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Serializable;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/5.
 * PS: Not easy to write code, please indicate.
 */
public interface Jsonable extends Serializable {

    void read(JsonReader jsonReader, Gson gson) throws IOException;

    void write(JsonWriter jsonWriter, Gson gson) throws IOException;
}