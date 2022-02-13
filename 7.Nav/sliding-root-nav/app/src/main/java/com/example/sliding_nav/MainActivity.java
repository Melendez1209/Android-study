package com.example.sliding_nav;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //全局变量
    //页面
    private static final int POS_CLOSE = 0;
    private static final int POS_DASHBOARD = 1;
    private static final int POS_NEARBY_RES = 2;
    private static final int POS_ME = 4;
    private static final int POS_SETTINGS = 5;

    //2个用于传递项目名称及图标的字符串列表
    private String[] screenTitles;
    private Drawable[] screenIcons;

    //滑动根导航变量
    //16:39
    private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}