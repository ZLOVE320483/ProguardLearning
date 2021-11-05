package com.zlove.study.base.utils

import android.content.Context

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/4.
 * PS: Not easy to write code, please indicate.
 */
object UIUtils {

    @JvmStatic
    fun getScreenHeight(context: Context?): Int {
        context?: return 0
        val dm = context.resources.displayMetrics
        dm?: return 0
        return dm.heightPixels
    }

}