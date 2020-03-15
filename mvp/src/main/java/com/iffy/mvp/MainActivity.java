package com.iffy.mvp;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iffy.mvp.adapter.Adapter;

import com.iffy.mvp.presenter.GoodsPresenter;
import com.iffy.mvp.view.BaseActivity;
import com.iffy.mvp.view.IGoodsView;

import java.util.ArrayList;


//MVP 用法
public class MainActivity extends BaseActivity<GoodsPresenter, IGoodsView> implements IGoodsView {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        presenter.fetchData();
    }

    @Override
    protected void init() {

    }

    @Override
    protected void registSDK() {

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
