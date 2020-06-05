package com.lh.myapplication.http;

public class TokenBean {
    private String id;
    private String timesTamp = "";
    private boolean locationAutoSubmit = false;
    private int autoUpdateDurTime = 0;
    private int intervalTime = 0;
    private String state = "";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimesTamp() {
        return timesTamp;
    }

    public void setTimesTamp(String timesTamp) {
        this.timesTamp = timesTamp;
    }

    public boolean isLocationAutoSubmit() {
        return locationAutoSubmit;
    }

    public void setLocationAutoSubmit(boolean locationAutoSubmit) {
        this.locationAutoSubmit = locationAutoSubmit;
    }

    public int getAutoUpdateDurTime() {
        return autoUpdateDurTime;
    }

    public void setAutoUpdateDurTime(int autoUpdateDurTime) {
        this.autoUpdateDurTime = autoUpdateDurTime;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", timesTamp='" + timesTamp + '\'' +
                ", locationAutoSubmit=" + locationAutoSubmit +
                ", autoUpdateDurTime=" + autoUpdateDurTime +
                ", intervalTime=" + intervalTime +
                '}';
    }
}
