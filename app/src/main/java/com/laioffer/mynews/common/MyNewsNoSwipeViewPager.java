package com.laioffer.mynews.common;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyNewsNoSwipeViewPager extends ViewPager {

    public MyNewsNoSwipeViewPager(Context context) {
        super(context);
    }

    public MyNewsNoSwipeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        return false;
        // return super.onTouchEvent(event);
    }
}
