package com.gac.footprint.login;

import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;

import com.gac.footprint.R;

import com.gac.footprint.R2;
import com.gac.footprint.base.base.BaseActivity;
import com.gac.footprint.base.model.BaseResModel;
import com.gac.footprint.base.utils.StatusBarUtils;
import com.gac.footprint.base.utils.BitmapUtils;
import com.gac.footprint.base.utils.ToastUtils;
import com.gac.footprint.model.User;
import com.gac.footprint.net.Api;
import com.gac.footprint.net.response.GsonResponseHandler;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @title LoginActivity.java
 * @package com.gac.footprint.login
 * @description  {}
 * @author gacmy
 * @date 2018/6/17 0017
 *
 */
public class LoginActivity extends BaseActivity{
    @BindView(R2.id.root) FrameLayout root;
    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }



    @Override
    protected void initView() {
        StatusBarUtils.excludeBackground(this);
        ApplicationInfo appInfo = getApplicationInfo();
        int resID = getResources().getIdentifier("test", "drawable", appInfo.packageName);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            Bitmap bitmap = BitmapUtils.blurBitmap(this,BitmapFactory.decodeResource(getResources(), R.mipmap.test)) ;
            Drawable bitDrawable = new BitmapDrawable(bitmap);
            root.setBackground(bitDrawable);
        }
    }
//Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'connectionFactory' defined in class path resource [config/spring-config.xml]: Cannot resolve reference to bean 'poolConfig' while setting bean property 'poolConfig'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'poolConfig' defined in class path resource [config/spring-config.xml]: Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException: Invalid property 'maxActive' of bean class [redis.clients.jedis.JedisPoolConfig]: Bean property 'maxActive' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?


    @OnClick(R2.id.tv_forgetpwd)
    public void onClickFrogetPwd(){
        ToastUtils.getInstance().showToast("忘记密码");
    }

    @OnClick(R2.id.tv_login)
    public void onClickLogin(){
        ToastUtils.getInstance().showToast("登录");
        Api.login("gacmy", "123456", new GsonResponseHandler<BaseResModel<User>>() {
            @Override
            public void onSuccess(int statusCode, BaseResModel<User> response) {

            }

            @Override
            public void onFailure(int statusCode, String errorMsg) {

            }

            @Override
            protected void onFinish() {

            }
        });
    }

    @OnClick(R2.id.tv_register)
    public void onClickRegister(){
        ToastUtils.getInstance().showToast("注册");
    }
}
