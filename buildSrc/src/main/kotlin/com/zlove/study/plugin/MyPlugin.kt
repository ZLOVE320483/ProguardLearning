package com.zlove.study.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/4.
 * PS: Not easy to write code, please indicate.
 */
class MyPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        println("--- my plugin execute ---")
    }
}