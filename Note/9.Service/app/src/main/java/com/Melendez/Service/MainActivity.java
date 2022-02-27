package com.Melendez.Service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartServce(View view) {
        startService(new Intent(this, Service.class));//启动服务
    }

    public void StopServce(View view) {
        stopService(new Intent(this, Service.class));//停止服务
    }

    //跳转至领域2
    public void go_to_place2(View view) {
        startActivity(new Intent(this, Place2.class));
    }
}