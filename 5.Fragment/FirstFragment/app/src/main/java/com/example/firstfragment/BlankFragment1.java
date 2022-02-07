package com.example.firstfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BlankFragment1 extends Fragment {
    //全局变量
    private View root;
    private TextView textview;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //解析XML
        if (root == null) {
            root = inflater.inflate(R.layout.fragment_blank1, container, false);
        }
        textview = root.findViewById(R.id.tv);
        button = root.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textview.setText("这是Melendez的首个Fragment");

            }
        });
        return root;
    }
}