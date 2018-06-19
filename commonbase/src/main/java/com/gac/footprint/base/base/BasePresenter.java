package com.gac.footprint.base.base;


import android.arch.lifecycle.LifecycleOwner;

import org.jetbrains.annotations.NotNull;

public abstract class BasePresenter implements IPresenter {
    IView root;
    @Override
    public void attach(IView view) {
        root = view;
    }

    @Override
    public void detach() {
        root = null;
    }



    @Override
    public void onDestroy(@NotNull LifecycleOwner owner) {
        detach();
    }


}
