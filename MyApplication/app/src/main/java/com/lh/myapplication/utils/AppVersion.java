package com.lh.myapplication.utils;

public class AppVersion {
    public AppVersion(String mdm, String ota, String appStore, String screen) {
        this.mdm = mdm;
        this.ota = ota;
        this.appStore = appStore;
        this.screen = screen;
    }

    private String mdm;
    private String ota;
    private String appStore;
    private String screen;

    public String getMdm() {
        return mdm;
    }

    public void setMdm(String mdm) {
        this.mdm = mdm;
    }

    public String getOta() {
        return ota;
    }

    public void setOta(String ota) {
        this.ota = ota;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
