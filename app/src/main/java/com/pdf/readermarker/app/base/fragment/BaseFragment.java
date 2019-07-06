package com.pdf.readermarker.app.base.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pdf.readermarker.app.base.presenter.AbstractPresenter;
import com.pdf.readermarker.app.base.view.AbstractView;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public abstract class BaseFragment<P extends AbstractPresenter> extends AbstractFragment implements AbstractView {
    private P mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = setPresenter();
        super.onCreate(savedInstanceState);
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }

    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (mPresenter != null) {
            mPresenter = null;
        }
    }

    protected abstract P setPresenter();
}
