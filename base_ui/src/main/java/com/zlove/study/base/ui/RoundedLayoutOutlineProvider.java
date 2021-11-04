package com.zlove.study.base.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

import androidx.annotation.RequiresApi;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/4.
 * PS: Not easy to write code, please indicate.
 */
@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class RoundedLayoutOutlineProvider extends ViewOutlineProvider {
    private float mRadius;
    private int mWidth, mHeight;

    public RoundedLayoutOutlineProvider(float radius, int w, int h) {
        this.mRadius = radius;
        this.mWidth = w;
        this.mHeight = h;
    }

    @Override
    public void getOutline(View view, Outline outline) {
        Rect selfRect = new Rect(0, 0, mWidth, mHeight);
        outline.setRoundRect(selfRect, mRadius);
    }
}
