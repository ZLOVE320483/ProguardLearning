package com.zlove.study.proguard

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zlove.study.base.utils.UIUtils

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/4.
 * PS: Not easy to write code, please indicate.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "screenHeight --- ${UIUtils.getScreenHeight(this)}")
    }
}