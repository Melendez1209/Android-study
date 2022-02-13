package com.example.sliding_nav;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //全局变量
    //页面
    private final static int POS_CLOSE = 0;
    private final static int POS_DASHBOARD = 1;
    private final static int POS_NEARBY_RES = 2;
    private final static int POS_ME = 3;
    private final static int POS_SETTINGS = 4;

    //2个用于传递项目名称及图标的字符串列表
    private String[] screenTitles;
    private Drawable[] screenIcon;

    //滑动根导航变量
    //16:39
    private
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}