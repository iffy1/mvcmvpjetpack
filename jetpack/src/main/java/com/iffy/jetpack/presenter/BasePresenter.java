package com.iffy.jetpack.presenter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.iffy.jetpack.view.IBaseView;


/**
 * author : iffy
 * time   : 2020/03/14
 */
public class BasePresenter<T extends IBaseView> implements LifecycleObserver {
    //监听 生命周期
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate(LifecycleOwner owner) {
        //在子类中实现
    }

    //监听 生命周期
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner) {
        //在子类中实现
    }
}
