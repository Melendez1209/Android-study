package com.melendez.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver_Dynamic extends BroadcastReceiver {
    //全局变量
    private static final String TAG = "Melendez" + Receiver.class.getSimpleName();

    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: 广播接收者");
    }
}
