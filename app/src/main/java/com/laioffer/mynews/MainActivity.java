package com.laioffer.mynews;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.laioffer.mynews.common.ContainerFragment;
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
        // Link FragmentPagerAdapter with ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(MyNewsFragmentPagerAdapter.FRAGMENT_NUMBER);

        //add bottombar code from here
        bottomBar = findViewById(R.id.bottom_navigation);
        bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                viewPager.setCurrentItem(ContainerFragment.getPositionById(item.getItemId() ) );
                return true;
            }
        });
        //bottombar code end here
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void showSnackBar(String message) {

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
