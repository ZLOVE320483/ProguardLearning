package com.zlove.study.proguard;

import android.os.Bundle;

import com.zlove.study.proguard.utils.ShrinkUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/7.
 * PS: Not easy to write code, please indicate.
 */
public class MainActivity extends AppCompatActivity {

    private AppCompatTextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.test);

        textView.setText(String.valueOf(ShrinkUtils.generatePerson().getAge()));

    }
}
