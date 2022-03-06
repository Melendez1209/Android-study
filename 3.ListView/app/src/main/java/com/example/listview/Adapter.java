package com.example.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    //全局变量
    private final List<Bean> data;
    private final Context context;

    //构造方法
    public Adapter(List<Bean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();//返回数据的内容包括
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        TextView TextView = view.findViewById(R.id.TV);
        TextView.setText(data.get(i).getName());
        Log.w("Melendez", "getView: " + i);
        return view;
    }
}
