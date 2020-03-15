package com.iffy.jetpack.module;




import com.iffy.jetpack.R;
import com.iffy.jetpack.adapter.ItemBean;

import java.util.ArrayList;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public class GoodModel implements IModel {
    public void getData(DataCallBack cb) {
        ArrayList<ItemBean> data = new ArrayList<ItemBean>();
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第一"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第二"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第三"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第四"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第五"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第六"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第七"));
        data.add(new ItemBean(R.drawable.ic_launcher_background, "第八"));
        if (data != null) {
            cb.onLoadSuc(data);
        } else {
            cb.onLoadFailed("发生错误");
        }
    }
}
