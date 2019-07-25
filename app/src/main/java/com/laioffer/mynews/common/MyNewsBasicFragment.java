package com.laioffer.mynews.common;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laioffer.mynews.R;

import java.util.UUID;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyNewsBasicFragment extends Fragment {

    protected MyNewsFragmentManager myNewsFragmentManager;
    private final String uuid = UUID.randomUUID().toString();

    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        myNewsFragmentManager = (MyNewsFragmentManager) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_news_basic, container, false);
    }

    public String getFragmentTag() {
        return this.getClass().getName() + uuid;
    }
}
