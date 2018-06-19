package com.gac.footprint.net;

import com.gac.footprint.net.request.EasyPostBuilder;
import com.gac.footprint.net.response.IResponseHandler;


/**
 * @author gacmy
 * @title $fileName$
 * @package $packageName$
 * @description {}
 * @date $date$
 */
public class Api {
    /**
     * 登录
     * @param phone
     * @param pwd
     * @param handler
     */
    public static void login(String phone, String pwd, IResponseHandler handler){
        BaseRequest.post().url(URLConfig.LOGIN).addParam("phone",phone)
                .addParam("pwd",pwd).enqueue(handler);
    }


}
