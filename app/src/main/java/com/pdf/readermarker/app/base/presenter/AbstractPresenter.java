package com.pdf.readermarker.app.base.presenter;

import com.pdf.readermarker.app.base.view.AbstractView;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public interface AbstractPresenter<T extends AbstractView> {
    void attachView(T view);

    void detachView();
}
