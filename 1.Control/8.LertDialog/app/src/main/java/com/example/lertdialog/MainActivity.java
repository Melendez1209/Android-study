package com.example.lertdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Melendez";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View view) {
        //获取布局
        View Dialog_View = getLayoutInflater().inflate(R.layout.dialog_layout,null);
        //对话框构建器
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_baseline_add_comment_24)//图标
                .setTitle("对话框")//标题
                .setMessage("测试消息")//内容
                .setView(Dialog_View)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e(TAG, "确定按钮被点击");
                    }
                })//确定按钮
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e(TAG, "取消按钮被点击");
                    }
                })//取消按钮
                .setNeutralButton("中间", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e(TAG, "中间按钮被点击");
                    }
                })//中间按钮
                .create()//创建
                .show();//显示
    }
}