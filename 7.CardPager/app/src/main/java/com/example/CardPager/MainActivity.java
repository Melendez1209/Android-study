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

        ViewPager2 viewPager = (ViewPager2) findViewById(R.id.VP2);
        List<Integer> list = new ArrayList<>();//用于存放卡片的数组

        list.add(R.drawable.ic_baseline_broken_image_24);
        list.add(R.drawable.ic_baseline_airplay_24);
        list.add(R.drawable.ic_baseline_access_time_24);

        Card_Adapter adapter = new Card_Adapter(this, list);
        viewPager.setAdapter(adapter);
    }
}