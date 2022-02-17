package com.example.CardPager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//适配器继承自RecyclerView的ViewHolder
public class CardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    //全局变量
    private Context context;
    private List<String> carslists;//存放图片与标题的数组

    static class ViewHolder extends RecyclerView.ViewHolder {
        //变量
        CardView cardView;
        ImageView carsimage;
        TextView carsname;

        public ViewHolder(@NonNull View view) {
            super(view);
            cardView = (CardView) view;
            carsimage = (ImageView) view.findViewById(R.id.cars_image);
            carsname = (TextView) view.findViewById(R.id.cars_name);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //为避免资源浪费的Context初始化
        if (context == null) {
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String cars=carslists.get(position);


    }

    @Override
    public int getItemCount() {
        return carslists.size();
    }


}
