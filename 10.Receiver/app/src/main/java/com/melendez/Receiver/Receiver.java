package com.melendez.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

//接收者
public class Receiver extends BroadcastReceiver {
    //全局变量
    private static final String TAG = Receiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: 广播接收者");
    }
}
