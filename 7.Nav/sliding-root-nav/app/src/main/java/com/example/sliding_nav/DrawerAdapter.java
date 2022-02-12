package com.example.sliding_nav;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.ViewHolder> {
    //全局变量
    private List<Drawer_item> items;
    private Map<Class<? extends Drawer_item>, Integer> ViewTypes;
    private SparseArray<Drawer_item> holderFactories;
    private OnItemSelectedListener listener;

    public DrawerAdapter(List<Drawer_item> items) {
        this.items = items;
        this.ViewTypes = new HashMap<>();
        this.holderFactories = new SparseArray<>();
        viewStatement();


    }

    private void viewStatement() {
        int type = 0;
        for (Drawer_item item : items) {
            if (!ViewTypes.containsKey(item.getClass())) {
                ViewTypes.put(item.getClass(), type);
                holderFactories.put(type, item);
                type++;
            }
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolder holder = holderFactories.get(viewType).createViewHolder(parent);
        holder.drawerAdapter = this;
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        items.get(position).bindViewHolder(holder);
    }

    @Override
    public int getItemViewType(int position) {
        return ViewTypes.get(items.get(position).getClass());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //抽屉中创建项目
    public void setSelected(int position) {
        Drawer_item newChecked = items.get(position);
        if (!newChecked.isSelectable()) {
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            Drawer_item item = items.get(i);
            if (item.isChecked()) {
                item.setChecked(false);
                notifyItemChanged(i);
                break;
            }
        }
        newChecked.setChecked(true);
        notifyItemChanged(position);
        if (listener != null) {
            listener.onItemSelected(position);
        }
    }

    //为解决listener.onItemSelected(position);报错的接口
    public interface OnItemSelectedListener {
        void onItemSelected(int position);
    }

    //监听器
    public void setListener(OnItemSelectedListener listener) {
        this.listener = listener;
    }

    static abstract class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //全局变量
        private DrawerAdapter drawerAdapter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            drawerAdapter.setSelected(getAdapterPosition());
        }
    }
}
