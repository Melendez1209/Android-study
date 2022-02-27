package com.melendez.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //控件
        Toolbar toolbar = findViewById(R.id.toolbar);
        //进入设置Activity
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    //读取返回值
    public void read(View view) {
    }
}