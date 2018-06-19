package com.gac.footprint.base.app;

import android.app.Application;

import com.gac.footprint.base.utils.Constants;

/**
 * @title BaseApp.java
 * @package com.gac.footprint.base.app
 * @description  {基础app}
 * @author gacmy
 * @date 2018/6/16 0016
 *
 */

public class BaseApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Constants.init(this);
    }
}
