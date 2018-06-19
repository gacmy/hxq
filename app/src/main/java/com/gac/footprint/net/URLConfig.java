package com.gac.footprint.net;

/**
 * @title URLConfig.java
 * @package com.gac.footprint.net
 * @description  {}
 * @author gacmy
 * @date 2018/6/19 0019
 *
 */
public class URLConfig {
    private static  String BASEURL = "http://192.168.1.100:8080/hxq/mobile/";
    private static final String LOACALURL = "http://192.168.1.100/";
    private static final String TESTURL = "";
    private static final String ONLINEURL="";
    public static void init(int flag){
        switch (flag){
            case 0:
                BASEURL = LOACALURL;
                break;
            case 1:
                break;

        }
    }

    public static final String LOGIN=BASEURL+"user/login";//登录

}
