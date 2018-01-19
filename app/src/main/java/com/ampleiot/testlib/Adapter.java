package com.ampleiot.testlib;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ampleiot.baseadapter.BaseAdapter;
import com.ampleiot.baseadapter.BaseViewHolder;

/**
 * Created by Basavaraj Navi on 19/01/18.
 * Project library
 * Copyright (c) 2018 KaHa Technologies Pvt Ltd. All rights reserved.
 */

public class Adapter extends BaseAdapter<Model, Adapter.NameHolder> {

    //Item click callback to Activity/Fragment
    Callback callback;
    public Adapter(Context context, Callback callback) {
        super(context);// Don't forget to add it.
        this.callback = callback;
    }

    public Adapter(Context context) {
        super(context);
    }
    @Override
    public NameHolder getViewHolder(LayoutInflater inflater, ViewGroup parent, int viewType) {
        return new NameHolder(inflater.inflate(R.layout.item_list,parent,false));
    }

    public class NameHolder extends BaseViewHolder<Model>{
        TextView name;

        public NameHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }

        @Override
        public void onBindView(Context context, Model data, final int position) {
            name.setText(data.getName());
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //callback.onItemClick(position);
                }
            });
        }
    }
}
