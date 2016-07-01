package com.chillsweet.instachill.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chillsweet.instachill.R;

/**
 * Created by ChillSweet on 6/28/2016.
 */
public class MainFragmentActivity extends Fragment {

    private RecyclerView rvMainItems;

    public static MainFragmentActivity newInstance() {

        MainFragmentActivity myFragment = new MainFragmentActivity();
        Bundle args = new Bundle();
        myFragment.setArguments(args);

        return myFragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        rvMainItems = (RecyclerView) rootView.findViewById(R.id.rv_main_items);


        return rootView;
    }
}
