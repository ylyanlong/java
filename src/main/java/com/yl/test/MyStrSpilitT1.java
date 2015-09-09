package com.yl.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/9.
 */
public class MyStrSpilitT1 {
    public static Map<String, String> getPCUReportDataMap(String inputStr) {
        String[] params = inputStr.split("&");
        Map<String, String> map = new HashMap<String, String>();
        for (String param : params) {
            String[] pair = param.split("=");
            map.put(pair[(pair.length - 1) / 2], pair[pair.length / 2]);
        }
        return map;
    }

    public static void main(String[] args){
        String strGet = "uri=/a.gif&-&ot=1440382401&sed=1&te=2&cv=11.04&td=3&ud=3&sd=5&sbd=11&dr=1&" +
                "ip=0.0.0.0&in=%7B%22test%22%3A%22test%22%7D&srvstamp=1441524463.456";
        Map<String, String> mapGet = getPCUReportDataMap(strGet);
        System.out.println(mapGet);

        String strPost = "uri=/a.gif&ot=1440382401&sed=1&te=2&cv=11.04&td=3&ud=3&sd=5&sbd=11&dr=1&" +
                "ip=0.0.0.0&in=%7B%22test%22%3A%22test%22%7D&srvstamp=1441524463.456&-";
        Map<String, String> mapPost = getPCUReportDataMap(strPost);
        System.out.println(mapPost);
    }
}
