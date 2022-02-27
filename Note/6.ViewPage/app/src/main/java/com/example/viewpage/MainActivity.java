package com.example.viewpage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //控件调取
        ViewPager2 viewpage2 = findViewById(R.id.viewpager2);
        //传入适配器
        ViewPagerAdapter ViewPagerAdapter = new ViewPagerAdapter();
        viewpage2.setAdapter(ViewPagerAdapter);
    }
}