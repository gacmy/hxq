package com.gac.footprint.base.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gac.footprint.base.utils.ActivityUtils;

import com.gac.footprint.base.utils.RxBus;
import com.gac.footprint.base.utils.ToastUtils;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;


/**
 * @title BaseActivity.java
 * @package com.gac.footprint.base.base
 * @description  {}
 * @author gacmy
 * @date 2018/6/16 0016
 *
 */
public abstract class BaseActivity extends SwipeBackActivity{
    Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerActivity();
        subscribeEvent();
        setContentView(getLayoutId());
        butterknifeBind();
        initView();
    }

    private void butterknifeBind(){
        unbinder = ButterKnife.bind(this);
    }
    private void butterknifeUnbind(){
       if(unbinder != null){
           unbinder.unbind();
       }
    }
    /**
     * 是否可以滑动退出
     * @param flag
     */
    protected void setSwipeEnabled(boolean flag){
        setSwipeBackEnable(flag);
    }
    protected void initView(){

    }
    public abstract int getLayoutId();


    public void showToast(String text){
        ToastUtils.getInstance().showToast(text);
    }


    private void registerActivity(){
        ActivityUtils.getInstance().pushActivity(this);
    }

    private void destroyActivity(){
        ActivityUtils.getInstance().popActivity(this);
    }
    /**
     * 注册事件
     */
    protected void subscribeEvent(){
        //RxBus.get().toObservable().

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroyActivity();
        butterknifeUnbind();
        RxBus.get().unregisterEvent();
    }
}
