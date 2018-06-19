package com.gac.footprint.base.net;

import com.gac.footprint.net.request.EasyPostBuilder;
import com.gac.footprint.net.response.GsonResponseHandler;
import com.gac.footprint.net.response.IResponseHandler;

/**
 * @title BaseNet.java
 * @package com.gac.footprint.base.net
 * @description  {}
 * @author gacmy
 * @date 2018/6/19 0019
 *
 */
public class BaseNet {
    public static void post(IResponseHandler handler){
       // new EasyPostBuilder().params().enqueue(handler);
    }
}
