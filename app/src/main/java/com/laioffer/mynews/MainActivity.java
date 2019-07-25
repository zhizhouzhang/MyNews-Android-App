package com.laioffer.mynews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.laioffer.mynews.common.MyNewsBasicActivity;

public class MainActivity extends MyNewsBasicActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomBar;
    private MyNewsFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewPager = findViewById(R.id.viewpager);
        adapter = new MyNewsFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(MyNewsFragmentPagerAdapter.FRAGMENT_NUMBER);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    // life cycles
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
