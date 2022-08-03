package com.example.progressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgressBar PB;
    private ProgressBar PB_plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PB = findViewById(R.id.PB);
        PB_plus = findViewById(R.id.Progress_plus);

    }

    //进度条的隐藏与显示
    public void Melendez_On_click(View view) {
        if (PB.getVisibility() == View.GONE) {
            PB.setVisibility(View.VISIBLE);
        } else {
            PB.setVisibility(View.GONE);
        }
    }

    //模拟进度条的增加
    public void Progress_plus(View view) {
        int progress = PB_plus.getProgress();//获取进度
        progress += 10;
        PB_plus.setProgress(progress);//将值返回
    }
}