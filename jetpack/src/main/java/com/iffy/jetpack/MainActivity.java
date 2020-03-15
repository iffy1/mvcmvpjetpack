package com.iffy.jetpack;

import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.iffy.jetpack.adapter.Adapter;
import com.iffy.jetpack.presenter.GoodsPresenter;
import com.iffy.jetpack.view.BaseActivity;
import com.iffy.jetpack.view.IGoodsView;

import java.util.ArrayList;


//MVP 用法
public class MainActivity extends BaseActivity<GoodsPresenter> implements IGoodsView {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("iffy", "MainActivity onCreate start");
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        Log.e("iffy", "MainActivity onCreate done");
    }


    @Override
    protected void init() {
        Log.e("iffy", "MainActivity init");
        //添加订阅关系 让presenter能够感知这个activity的生命周期
        getLifecycle().addObserver(presenter);
    }


    @Override
    protected GoodsPresenter createPresenter() {
        return new GoodsPresenter();
    }


    @Override
    public void showError(String s) {

    }

    @Override
    public void showData(ArrayList data) {
        recyclerView.setAdapter(new Adapter(data));
    }
}
