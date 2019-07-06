package com.pdf.readermarker.app.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pdf.readermarker.app.base.presenter.AbstractPresenter;
import com.pdf.readermarker.app.base.view.AbstractView;
import com.pdf.readermarker.util.ToastUtil;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public abstract class BaseActivity<P extends AbstractPresenter> extends AbstractActivity implements AbstractView {
    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = setPresenter();
        super.onCreate(savedInstanceState);
        if (mPresenter != null)
            mPresenter.attachView(this);
    }

    protected abstract P setPresenter();

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
            mPresenter = null;
        }
        super.onDestroy();
    }

    //    @Override
    public void showToast(String message) {
        ToastUtil.showToast(this, message);
    }
}
