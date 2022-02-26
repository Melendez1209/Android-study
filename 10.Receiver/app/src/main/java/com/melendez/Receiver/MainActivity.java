package com.melendez.Receiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Receiver_Dynamic receiver_dynamic = new Receiver_Dynamic();
        IntentFilter filter = new IntentFilter();
        filter.addAction(ActionUtils.ACTION_EQUES_UPDATE_IP);
        registerReceiver(receiver_dynamic, filter);
    }

    //静态发送广播给接收者
    public void send_receiver_static_state(View view) {
        Intent intent = new Intent();
        intent.setAction(ActionUtils.ACTION_FLAG);//与注册保持一致的凭证
        sendBroadcast(intent);
    }

    //动态发送接收广播
    public void send_receiver_dynamic(View view) {

    }
}