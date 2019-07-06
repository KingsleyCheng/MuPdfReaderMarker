package com.pdf.readermarker.pdf.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.view.WindowManager;

import com.pdf.readermarker.R;
import com.pdf.readermarker.app.base.activity.BaseActivity;
import com.pdf.readermarker.contract.WelcomeContract;
import com.pdf.readermarker.pdf.presenter.WelcomePresenter;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 */
public class WelcomeActivity extends BaseActivity<WelcomePresenter> implements WelcomeContract.View {
    @Override
    protected WelcomePresenter setPresenter() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        return new WelcomePresenter();
    }


    @Override
    protected int initLayout() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initView() {

    }

    @Override
    public void jumpMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
