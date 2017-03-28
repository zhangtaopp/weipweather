package com.weipweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/28 0028.
 * 记录全国城市
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provnveId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvnveId() {
        return provnveId;
    }

    public void setProvnveId(int provnveId) {
        this.provnveId = provnveId;
    }
}
