package com.example.demo.bean.Weather;

import java.util.List;

public class Weatherforecast_out {
    private String location;
    private List<Weather> weatherforecast;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Weather> getWeatherforecast() {
        return weatherforecast;
    }

    public void setWeatherforecast(List<Weather> weatherforecast) {
        this.weatherforecast = weatherforecast;
    }
}
