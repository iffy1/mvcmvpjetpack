package com.iffy.mvp.view;

import java.util.ArrayList;

/**
 * author : iffy
 * time   : 2020/03/14
 */
public interface IGoodsView extends IBaseView {
    void showError(String s);
    void showData(ArrayList data);
}
