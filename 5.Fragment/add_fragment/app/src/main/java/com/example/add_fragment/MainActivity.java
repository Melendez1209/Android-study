package com.example.add_fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    //重头戏
    private void replace(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();//管理类
        FragmentTransaction transaction = fragmentManager.beginTransaction();//触发器
        transaction.replace(R.id.FrameLayout, fragment);//创建事件
        transaction.commit();//触发事件

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void replace(View view) {
        switch (view.getId()) {
            case R.id.blank_btn:
                replace(new BlankFragment());
                break;
            case R.id.list_btn:
                replace(new ItemFragment());
                break;
        }
    }


}