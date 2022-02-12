package com.example.sliding_nav;

import android.view.ViewGroup;

public abstract class Drawer_item<T extends DrawerAdapter.ViewHolder> {
    //声明变量
    protected boolean isChecked;

    public abstract T createViewHolder(ViewGroup parent);

    public abstract void bindViewHolder(T Holder);

    public Drawer_item<T> setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        return this;
    }

    public boolean isChecked() {
        return isChecked();
    }

    public boolean isSelectable() {
        return true;
    }
}
