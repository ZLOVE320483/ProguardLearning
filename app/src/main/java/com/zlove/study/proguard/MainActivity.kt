package com.zlove.study.proguard

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2022/5/8.
 */
class MainActivity : AppCompatActivity() {
    // 1. 创建一个 MainScope
    private val scope = MainScope()
    private lateinit var mText: TextView
    private lateinit var mFlowText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mText = findViewById(R.id.test)
        mFlowText = findViewById(R.id.flow_text)

        // 2. 启动协程
        scope.launch {
            val one = getResult(20)
            val two = getResult(40)
            mText.text = (one + two).toString()
        }

        lifecycleScope.launch {
            createFlow()
                .flowOn(Dispatchers.IO)
                .catch {

                }
                .onCompletion {

                }
                .collect {
                    mFlowText.text = it.toString()
            }
        }

    }

    // 3. 销毁的时候释放
    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

    private suspend fun getResult(num: Int): Int {
       return withContext(Dispatchers.IO) {
            delay(1000)
            num * num
        }
    }

    private fun createFlow(): Flow<Int> = flow {
        for (i in 1..10) {
            emit(i)
        }
    }
}