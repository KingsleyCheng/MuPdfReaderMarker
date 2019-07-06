package com.pdf.readermarker.pdf.presenter;

import com.pdf.readermarker.app.base.presenter.BasePresenter;
import com.pdf.readermarker.contract.MainContract;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    @Override
    public void attachView(MainContract.View view) {
        super.attachView(view);
        getDocument();
    }

    @Override
    public void getDocument() {

    }
}
