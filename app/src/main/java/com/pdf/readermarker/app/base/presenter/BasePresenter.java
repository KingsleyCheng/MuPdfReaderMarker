package com.pdf.readermarker.app.base.presenter;

import com.pdf.readermarker.app.base.view.AbstractView;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public class BasePresenter<T extends AbstractView> implements AbstractPresenter<T> {
    private CompositeDisposable mDisposable;
    private T mView;

    @Override
    public void attachView(T view) {
        if (view != null) {
            mView = view;
        }
    }

    @Override
    public void detachView() {
        this.mView = null;
        if (mDisposable != null) {
            mDisposable.clear();
        }
    }

    protected void addSubscrib(Disposable disposable) {
        if (mDisposable == null) {
            mDisposable = new CompositeDisposable();
        }
        mDisposable.add(disposable);
    }
}
