package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 每个实体类都有id
 * cityName记录城市的名字
 * cityCode记录城市的代号
 * provinceId记录当前城市所属省的id值
 */
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int provinceId;
    private int cityCode;

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
