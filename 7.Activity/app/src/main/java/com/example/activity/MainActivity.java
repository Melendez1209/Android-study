package com.example.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//默认Activity
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}