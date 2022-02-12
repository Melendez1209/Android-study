package com.example.sliding_nav;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

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
    private AdapterView.OnItemSelectedListener listener;

    public DrawerAdapter(List<Drawer_item> items) {
        this.items = items;
        this.ViewTypes = new HashMap<>();
        this.holderFactories = new SparseArray<>();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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

        }
    }
}
