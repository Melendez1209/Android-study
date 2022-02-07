package com.example.listview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //全局变量
    private List<Bean> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //传入100个Melendez+序号的值
        for (int i = 0; i < 100; i++) {
            Bean bean = new Bean();
            bean.setName("Melendez" + i);
            data.add(bean);
        }

        //find by id
        ListView ListView = findViewById(R.id.LV);

        //传入Adapter
        ListView.setAdapter(new Adapter(data, this));


        //点击事件
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.w("Melendez", "onItemClick: " + i);
            }
        });

    }
}