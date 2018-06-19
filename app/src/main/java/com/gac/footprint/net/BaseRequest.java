package com.gac.footprint.net;

import com.gac.footprint.net.request.EasyPostBuilder;

import java.util.HashMap;

/**
 * @author gacmy
 * @title $fileName$
 * @package $packageName$
 * @description {}
 * @date $date$
 */
public class BaseRequest {
    public static EasyPostBuilder post(){
        HashMap<String,String> heads = new HashMap<>();
        return new EasyPostBuilder().headers(heads);
    }
}
