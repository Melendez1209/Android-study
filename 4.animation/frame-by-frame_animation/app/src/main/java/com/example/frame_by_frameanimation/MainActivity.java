package com.example.frame_by_frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //标志位
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rlt = findViewById(R.id.layout);
        AnimationDrawable background = (AnimationDrawable) rlt.getBackground();
        rlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //动画未启动时
                if (flag) {
                    background.start();
                    flag = false;
                }
                //动画启动时
                else {
                    background.stop();
                    flag = true;

                }

            }
        });
    }
}