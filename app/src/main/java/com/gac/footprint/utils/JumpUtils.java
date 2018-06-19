package com.gac.footprint.utils;

import android.content.Context;
import android.content.Intent;

import com.gac.footprint.login.LoginActivity;

/**
 * @title JumpUtils.java
 * @package com.gac.footprint.utils
 * @description  {}
 * @author gacmy
 * @date 2018/6/17 0017
 *
 */
public class JumpUtils {

    public static void toLogin(Context context,Class cls){
        to(context, LoginActivity.class);
    }
    private static void to(Context context,Class cls){
        context.startActivity(new Intent(context,cls));
    }
}
