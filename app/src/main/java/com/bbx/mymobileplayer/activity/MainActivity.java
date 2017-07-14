package com.bbx.mymobileplayer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.bbx.mymobileplayer.R;

/**
 * Author：FREAK on 2017/7/10 13:21.
 * Effect：******
 */

public class MainActivity extends AppCompatActivity {

    private FrameLayout fl_main_content;

    private RadioGroup rg_bottom_tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        fl_main_content = (FrameLayout) findViewById(R.id.fl_main_content);

    }
}
