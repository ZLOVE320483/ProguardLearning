package com.zlove.study.base.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

/**
 * Author by zlove, Email zlove.zhang@bytedance.com, Date on 2021/11/4.
 * PS: Not easy to write code, please indicate.
 */
public class RoundedLinearLayout extends LinearLayout {

    private Path mPath;
    private int mRadius = 0;

    public RoundedLinearLayout(Context context) {
        this(context, null);
    }

    public RoundedLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundedLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RoundedView, defStyleAttr, 0);
        if (ta.hasValue(R.styleable.RoundedView_rounded_radius)) {
            mRadius = ta.getDimensionPixelOffset(R.styleable.RoundedView_rounded_radius, 0);
        }
        ta.recycle();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setRadius(int w, int h) {
        if (mRadius > 0 && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setClipToOutline(true);
            setOutlineProvider(new RoundedLayoutOutlineProvider(mRadius, w, h));
        }
    }

    public void setRadius(int dpValue) {
        mRadius = dpValue;
        if (getHeight() != 0 && getWidth() != 0) {
            setRadius(getWidth(), getHeight());
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mRadius == 0 || Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setRadius(w, h);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (mRadius == 0 || Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            super.dispatchDraw(canvas);
            return;
        }

        if (mPath == null && mRadius > 0) {
            int w = getWidth();
            int h = getHeight();
            if (w > 0 && h > 0) {
                mPath = new Path();
                mPath.addRoundRect(new RectF(0, 0, w, h), new float[] {mRadius, mRadius, mRadius, mRadius, mRadius, mRadius, mRadius,

                        mRadius}, Path.Direction.CW);
            }
        }
        if (mPath != null) {
            canvas.clipPath(mPath);
        }
        super.dispatchDraw(canvas);
    }

}