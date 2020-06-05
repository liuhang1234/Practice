package com.lh.myapplication.utils;

import android.util.ArrayMap;

import com.google.gson.Gson;

public class TokenUtils {

    public static ArrayMap<String, Object> getMapAllDevInfo() {




        String serialNumber = "P100AAGF000G3003898";
        //获取所有版本的 信息

        String serialNumberKsn = "";

        String googleId = "11111111";

        AppVersion appVersion = new AppVersion("v1.5.1.67" ,  "v2.7.0.91", "1.9.2", "");

        ArrayMap<String, Object> map = new ArrayMap<>();
        map.put("serialNumber", serialNumber);
        map.put("aliyun_deviceid", "058f2f4925cd12345bbd67b48719f6a");
        map.put("customerName", "common");
        map.put("customerSubName", "first");
        map.put("model", "P2000");
        map.put("manufacturer", "basewin");
        map.put("version", "");
        map.put("otaAppVersion", "v2.7.0.91");
        map.put("appstoreVersion", "1.9.2");
        map.put("function", "11111");//设备支持功能

        map.put("extend.platform", "msm8909");
        map.put("extend.v_hardware", "MP");
        map.put("extend.v_android", "5.1.1");
        map.put("extend.v_mdm", "1.5.1.61");

        map.put("extend.network_type", "WIFI");
        map.put("extend.v_pos_sub_sdk", "2.1.65_20191015");
        map.put("extend.v_pos_main_sdk", "22");
        map.put("extend.build_description", "msm8909  9 PKQ1.190903.001 eng.scm03.20200114.184911 dev-keys");
        map.put("extend.v_modem", "SC20CEQAR01A13");
        map.put("extend.bluetooth_address", "20:59:A0:18:01:AF");
        map.put("extend.wifi_address", "20:59:a0:13:1e:f3");
        map.put("extend.sp_status", "0");
        map.put("extend.imei", "865650030527101");
        map.put("extend.storage_status", "内部共享存储空间:4.05 GB/4.96 GB");
        map.put("extend.location_info", "31.188347, 121.423955");
        map.put("extend.v_kernel", "3.18.120-svn3080 scm03@scm03-pc #1 Tue Jan 14 19:01:14 CST 2020");

        map.put("allVersion", "ap:V3.94.6560");
        map.put("firmwareVersion", "");
        map.put("customVersion", "");

        map.put("extend.appVersion", new Gson().toJson(appVersion));
        map.put("ksn",serialNumberKsn);
        map.put("googleId",googleId);
        return map;
    }
}
