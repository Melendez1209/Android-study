package com.example.buttonevent;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Melendez";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Long_press = findViewById(R.id.Long_press);//长按按钮获取
        Button click = findViewById(R.id.click);//点击按钮获取
        Button touch = findViewById(R.id.touch);//触摸按钮获取

        //点击事件
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "On click");

            }
        });

        //长按事件
        Long_press.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e(TAG, "On Long_press");
                return false;
            }
        });

        //触摸事件
        touch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e(TAG, "On touch");
                return false;
            }
        });
    }
}