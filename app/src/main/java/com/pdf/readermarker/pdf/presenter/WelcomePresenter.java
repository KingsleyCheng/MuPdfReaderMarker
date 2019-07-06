package com.pdf.readermarker.pdf.presenter;

import com.pdf.readermarker.app.base.presenter.BasePresenter;
import com.pdf.readermarker.contract.WelcomeContract;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public class WelcomePresenter extends BasePresenter<WelcomeContract.View> implements WelcomeContract.Presenter {
    @Override
    public void attachView(final WelcomeContract.View view) {
        super.attachView(view);
        int SPLASH_DURATION = 1500;
        addSubscrib(Observable.timer(SPLASH_DURATION, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread())
                .subscribe(aLong -> view.jumpMain()));
    }
}
