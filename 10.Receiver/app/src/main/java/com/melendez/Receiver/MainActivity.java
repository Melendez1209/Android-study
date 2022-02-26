package com.melendez.Receiver;

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

    //静态发送广播给接收者
    public void send_receiver(View view) {
        Intent intent = new Intent();
        intent.setAction(ActionUtils.ACTION_FLAG);//与注册保持一致的凭证
        sendBroadcast(intent);
    }
}