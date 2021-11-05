package com.zlove.study.plugin.common.log

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/4.
 * PS: Not easy to write code, please indicate.
 */
interface ILogger {

    fun setTag(tag: String)

    fun d(msg: String)

    fun d(tag: String, msg: String)
}