package com.iffy.jetpack.view;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.iffy.jetpack.presenter.BasePresenter;


/**
 * author : iffy
 * time   : 2020/03/14
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("iffy", "BaseActivity onCreate start");
        //presenter的选择权交给子类
        presenter = createPresenter();
        //模板方法
        init();
        Log.e("iffy", "BaseActivity onCreate done");

    }

    protected abstract void init();

    //presenter的选择权交给子类
    protected abstract T createPresenter();
}
