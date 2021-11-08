package com.zlove.study.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/5.
 * PS: Not easy to write code, please indicate.
 */
class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        System.out.println("--- MyPlugin Execute ---");
    }
}
