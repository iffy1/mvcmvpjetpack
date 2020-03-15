package com.iffy.mvp.presenter;

import com.iffy.mvp.adapter.ItemBean;
import com.iffy.mvp.module.IModel;
import com.iffy.mvp.module.GoodModel;
import com.iffy.mvp.view.IGoodsView;

import java.util.ArrayList;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public class GoodsPresenter extends BasePresenter {
    //持有model和view的引用
    private GoodModel model = new GoodModel();

    //执行业务逻辑
    public void fetchData() {
        if (model != null && iBaseView != null) {
            model.getData(new IModel.DataCallBack() {
                @Override
                public void onLoadSuc(ArrayList<ItemBean> data) {
                    //iBaseView是weakReference所以需要得到后需要强转
                    ((IGoodsView) iBaseView.get()).showData(data);
                }

                @Override
                public void onLoadFailed(String error) {
                    ((IGoodsView) iBaseView.get()).showError("错误");
                }
            });
        }
    }


}
