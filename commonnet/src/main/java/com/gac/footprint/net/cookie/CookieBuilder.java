package com.gac.footprint.net.cookie;


import com.gac.footprint.net.EasyOkHttp;

import okhttp3.HttpUrl;

/**
 * Created by Administrator on 2018/3/13.
 */

public class CookieBuilder {
    EasyOkHttp mClient;
    public CookieBuilder(EasyOkHttp client){
        mClient = client;
    }

    public void loadCookies(String url){
       mClient.getOkHttpClient().cookieJar().loadForRequest(HttpUrl.parse(url));
    }
}
