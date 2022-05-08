package com.zlove.study.proguard;

import android.os.Bundle;
import android.widget.TextView;

import com.zlove.study.proguard.bean.Worker;
import com.zlove.study.proguard.utils.GenerateWorkerFactory;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/7.
 * PS: Not easy to write code, please indicate.
 */
public class MainActivity extends AppCompatActivity {

    private TextView tvTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTest = findViewById(R.id.test);

        Worker worker = GenerateWorkerFactory.generateWorker();
        if (worker != null) {
            String content = "Worker Name: " + worker.getName() + ", Worker Age: " + worker.getAge();
            tvTest.setText(content + "\n" + Worker.class.getName());
            worker.printName();
        }
    }

}
