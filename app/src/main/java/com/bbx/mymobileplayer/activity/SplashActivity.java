package com.bbx.mymobileplayer.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;

import com.bbx.mymobileplayer.R;

import java.util.Date;

public class SplashActivity extends Activity {

    private static final String TAG = SplashActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // 延迟一段时间执行操作
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // 3秒后执行到这里
                // 执行在主线程中
                startMainActivity();
                Log.e(TAG, "当前线程名称————>" + Thread.currentThread().getName() + "，当前时间：" + new Date().getSeconds());
            }
        }, 9000);
    }

    /**
     * 跳转到主页面，并且关闭当前页面
     */
    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent==Action" + event.getAction() + "，当前时间：" + new Date().getSeconds());
        startMainActivity();
        return super.onTouchEvent(event);
    }
}
