package com.example.makeupanimation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findbyid
        //全局变量
        ImageView IM = findViewById(R.id.IM);
        ImageView IM2 = findViewById(R.id.IM2);
        //通过下载XML文件,来创建一个Animation对象
        Animation all = AnimationUtils.loadAnimation(MainActivity.this, R.anim.all);
        //启动动画
        IM.startAnimation(all);
        IM2.startAnimation(all);

    }
}