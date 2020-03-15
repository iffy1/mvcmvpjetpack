package com.iffy.mvp.presenter;

import android.util.Log;

import com.iffy.mvp.view.IBaseView;
import com.iffy.mvp.view.IGoodsView;

import java.lang.ref.WeakReference;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public class BasePresenter<T extends IBaseView> {
    //iBaseView是weakReference所以需要得到后需要强转
    WeakReference<T> iBaseView;

    public void attach(T v) {
        Log.e("iffy","Attach");
        iBaseView = new WeakReference<>(v);
    }

    public void detach() {
        Log.e("iffy","Detach");
        iBaseView.clear();
        iBaseView = null;
    }
}
