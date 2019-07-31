package com.laioffer.mynews.save;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laioffer.mynews.R;
import com.laioffer.mynews.common.MyNewsBasicFragment;
import com.laioffer.mynews.save.detail.SavedNewsDetailedFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SavedNewsFragment extends MyNewsBasicFragment {

    public static SavedNewsFragment newInstance() {
        Bundle args = new Bundle();
        SavedNewsFragment fragment = new SavedNewsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saved_news, container, false);
        view.findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myNewsFragmentManager.doFragmentTransaction(SavedNewsDetailedFragment.newInstance());
            }
        });
        return view;

    }

    //lifecycle code starts from here
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
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
