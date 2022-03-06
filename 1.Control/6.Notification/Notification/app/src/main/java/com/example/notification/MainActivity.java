package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private NotificationManager Manager;
    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取通知管理类
        Manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //设置通知重要性
        NotificationChannel Channel = new NotificationChannel("Melendez", "测试通知", NotificationManager.IMPORTANCE_HIGH);
        //调用通知重要性
        Manager.createNotificationChannel(Channel);
        //创建通知跳转意图
        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        //创建通知
        notification = new NotificationCompat.Builder(this, "Melendez")
                .setContentTitle("测试通知")//通知标题
                .setContentText("这是一个测试通知")//通知内容
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_baseline_notifications_24))//大图标
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)//小图标
                .setColor(Color.parseColor("#62CD33"))//小图标颜色
                .setContentIntent(pendingIntent)//跳转意图
                .setAutoCancel(true)//点击后清除
                .build();
    }

    public void sendnotification(View view) {
        //发送通知
        Manager.notify(1, notification);
    }

    public void canelnotification(View view) {
        //取消通知
        Manager.cancel(1);
    }
}