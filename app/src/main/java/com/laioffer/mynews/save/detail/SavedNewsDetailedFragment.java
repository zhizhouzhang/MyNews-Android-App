package com.laioffer.mynews.save.detail;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laioffer.mynews.R;
import com.laioffer.mynews.common.MyNewsBasicFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SavedNewsDetailedFragment extends MyNewsBasicFragment {

    public static SavedNewsDetailedFragment newInstance() {
        Bundle args = new Bundle();
        SavedNewsDetailedFragment fragment = new SavedNewsDetailedFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved_news_detailed, container, false);
    }

}
