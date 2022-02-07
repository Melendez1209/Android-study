package com.example.viewpagerfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {
    //全局变量
    private View RootView;//一个用于检查是否重复解析布局的变量
    private static final String ARG_PARAM1 = "param1";
    private String mParam;

    public BlankFragment() {
    }

    public static BlankFragment newInstance(String param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (RootView == null) {
            RootView = inflater.inflate(R.layout.fragment_blank, container, false);
        }
        initView();
        return RootView;
    }

    private void initView() {
        TextView textView = RootView.findViewById(R.id.text);
        textView.setText(mParam);
    }
}