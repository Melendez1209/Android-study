package com.Melendez.Service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Place2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place2);
    }

    public void StartBindServce(View view) {
        bindService(new Intent(this, Service.class), connecton, Context.BIND_AUTO_CREATE);//绑定服务
    }

    public void StopBindServce(View view) {
        unbindService(connecton);//解绑服务
    }

    //跳转至领域1
    public void go_to_place1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    //Place2 & Service的桥梁
    private ServiceConnection connecton = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

    //此Activity被销毁时，自动解绑
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(connecton);
    }
}