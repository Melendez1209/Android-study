package com.example.CardPager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定控件
        ViewPager2 viewPager = (ViewPager2) findViewById(R.id.VP2);
        List<Integer> list = new ArrayList<>();//存放图标的数组
        //绑定图标
        list.add(R.drawable.ic_baseline_access_time_24);
        list.add(R.drawable.ic_baseline_airplay_24);
        list.add(R.drawable.ic_baseline_broken_image_24);
    }
}