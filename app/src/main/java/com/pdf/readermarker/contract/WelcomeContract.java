package com.pdf.readermarker.contract;

import com.pdf.readermarker.app.base.presenter.AbstractPresenter;
import com.pdf.readermarker.app.base.view.AbstractView;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public interface WelcomeContract {
    interface View extends AbstractView {
        void jumpMain();
    }

    interface Presenter extends AbstractPresenter<View> {

    }
}
