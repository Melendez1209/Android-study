package com.example.viewpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder> {
    //全局变量
    private final List<String> titles = new ArrayList<>();//用于存储String的列表

    //初始化titles
    public ViewPagerAdapter() {
        titles.add("Melendez");
        titles.add("的");
        titles.add("首个");
        titles.add("ViewPager");
    }

    @NonNull
    @Override
    public ViewPagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerViewHolder holder, int position) {
        holder.TV.setText(titles.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();//几个标题就是几个界面
    }

    static class ViewPagerViewHolder extends RecyclerView.ViewHolder {
        TextView TV;
        RelativeLayout container;

        public ViewPagerViewHolder(@NonNull View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.container);
            TV = itemView.findViewById(R.id.textView);

        }
    }
}
