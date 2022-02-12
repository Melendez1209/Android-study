package com.example.sliding_nav;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class SimpleItem extends Drawer_item<SimpleItem.ViewHolder> {
    //全局变量
    //用于区分是否选择
    private int selectedItemIconTint;
    private int selectedItemTextTint;

    private int normalItemIconTint;
    private int normalItemTextTint;

    private Drawable icon;
    private String title;

    @Override
    public ViewHolder createViewHolder(ViewGroup parent) {
        Context context;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_option, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void bindViewHolder(ViewHolder Holder) {
        //绑定内容
        //文本
        Holder.title.setText(title);
        //图像
        Holder.icon.setImageDrawable(icon);

    }

    //为视图持有者创建一个内部类
    static class ViewHolder extends DrawerAdapter.ViewHolder {

        //全局变量
        //图像
        private ImageView icon;

        //文本
        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //绑定控件
            //图像
            icon = itemView.findViewById(R.id.icon);

            //文本
            title = itemView.findViewById(R.id.title);
        }
    }
}
