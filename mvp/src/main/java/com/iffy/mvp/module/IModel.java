package com.iffy.mvp.module;

import com.iffy.mvp.adapter.ItemBean;

import java.util.ArrayList;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public interface IModel {
    void getData(DataCallBack cb);

    interface DataCallBack {
        void onLoadSuc(ArrayList<ItemBean> data);
        void onLoadFailed(String error);
    }
}
