package com.example.sliding_nav;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class SpaceItem extends Drawer_item<SpaceItem.ViewHolder> {
    //全局变量
    //声明与构造函数
    private int spaceDp;

    public SpaceItem(int spaceDp) {
        this.spaceDp = spaceDp;
    }

    @Override
    public ViewHolder createViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void bindViewHolder(ViewHolder Holder) {

    }

    //内部视图持有人类
    public class ViewHolder extends DrawerAdapter.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
