package com.modularization.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.modularization.biz.module.main.MainActivity;


/**
 * App闪屏页
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}