package com.gac.footprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gac.footprint.login.LoginActivity;
import com.gac.footprint.utils.JumpUtils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        JumpUtils.toLogin(this, LoginActivity.class);
    }
}
