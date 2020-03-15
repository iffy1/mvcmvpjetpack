package com.iffy.jetpack.presenter;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import com.iffy.jetpack.adapter.ItemBean;
import com.iffy.jetpack.module.GoodModel;
import com.iffy.jetpack.module.IModel;
import com.iffy.jetpack.view.IBaseView;
import com.iffy.jetpack.view.IGoodsView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public class GoodsPresenter<T extends IGoodsView> extends BasePresenter {
    private GoodModel model = new GoodModel();
    //iBaseView是weakReference所以需要得到后需要强转
    WeakReference<T> iBaseView;

    @Override
    void onCreate(LifecycleOwner owner) {
        super.onCreate(owner);
        Log.e("iffy", "onCreate Attach");
        iBaseView = new WeakReference<>((T)owner);
        fetchData();
    }

    @Override
    void onDestroy(LifecycleOwner owner) {
        Log.e("iffy", "onDestroy Detach");
        super.onDestroy(owner);
        iBaseView.clear();
        iBaseView = null;
    }

    //执行业务逻辑
    public void fetchData() {
        Log.e("iffy", "fetchData");
        if (model != null && iBaseView != null) {
            model.getData(new IModel.DataCallBack() {
                @Override
                public void onLoadSuc(ArrayList<ItemBean> data) {
                    Log.e("iffy", "onLoadSuc");
                    //iBaseView是weakReference所以需要得到后需要强转
                    ((IGoodsView) iBaseView.get()).showData(data);
                }

                @Override
                public void onLoadFailed(String error) {
                    Log.e("iffy", "onLoadFailed");
                    ((IGoodsView) iBaseView.get()).showError("错误");
                }
            });
        }
    }


}
