package com.pdf.readermarker.pdf.ui.activity;

import android.view.KeyEvent;

import com.pdf.readermarker.R;
import com.pdf.readermarker.app.base.activity.BaseActivity;
import com.pdf.readermarker.contract.MainContract;
import com.pdf.readermarker.pdf.presenter.MainPresenter;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Create by KingsleyCheng on 2019/7/6.
 * Email:KingsleyCheng@163.com
 *
 * @deprecated
 */
public class MainActivity1 extends BaseActivity<MainPresenter> implements MainContract.View {
    private static Boolean isExit = false;
    private static final int ANIMATION_DURATION = 800;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected MainPresenter setPresenter() {
        return new MainPresenter();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 在2秒内按下返回键两次才退出
     */
    private void exitBy2Click() {
        if (!isExit) {
            isExit = true;
            showToast("再次点击退出");
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false;
                }
            }, ANIMATION_DURATION);

        } else {
            finish();
            System.exit(0);
        }
    }

    @Override
    public void showDocument() {

    }
}
