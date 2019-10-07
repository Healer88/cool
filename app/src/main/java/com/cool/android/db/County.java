package com.cool.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String counttName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCounttName() {
        return counttName;
    }

    public void setCounttName(String counttName) {
        this.counttName = counttName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}