package com.laioffer.mynews.common;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.laioffer.mynews.R;

public class ContainerFragment extends MyNewsBasicFragment {
    private int pageIndex;

    public static ContainerFragment newInstance(int pageIndex) {
        ContainerFragment containerFragment = new ContainerFragment();
        containerFragment.pageIndex = pageIndex;
        return containerFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        TextView textView = view.findViewById(R.id.text);
        textView.setText("This is containerFragment" + pageIndex);
        return view;
    }

}
