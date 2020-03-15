package com.iffy.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.iffy.mvp.presenter.BasePresenter;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public abstract class BaseActivity<T extends BasePresenter, V extends IBaseView> extends AppCompatActivity implements IBaseView {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //presenter的选择权交给子类
        presenter = createPresenter();
        presenter.attach(this);

        //模板方法
        registSDK();
        init();

    }

    protected abstract void init();

    protected abstract void registSDK();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detach();
    }

    //presenter的选择权交给子类
    protected abstract T createPresenter();
}
