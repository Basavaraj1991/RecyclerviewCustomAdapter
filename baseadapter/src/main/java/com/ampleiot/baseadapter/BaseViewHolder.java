package com.ampleiot.baseadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Basavaraj Navi on 19/01/18.
 * Project library
 * Copyright (c) 2018 KaHa Technologies Pvt Ltd. All rights reserved.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindView(Context context, T data, int position);
}
