package com.example.demo.bean.Weather;

public class Weather {
    private String date;
    private String weather;
    //private String ave_tem;
    private String max_tem;
    private String min_tem;
    private String win;
    private String win_level;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    /**
    public String getAve_tem() {
        return ave_tem;
    }

    public void setAve_tem(String ave_tem) {
        this.ave_tem = ave_tem;
    }
     **/

    public String getMax_tem() {
        return max_tem;
    }

    public void setMax_tem(String max_tem) {
        this.max_tem = max_tem;
    }

    public String getMin_tem() {
        return min_tem;
    }

    public void setMin_tem(String min_tem) {
        this.min_tem = min_tem;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getWin_level() {
        return win_level;
    }

    public void setWin_level(String win_level) {
        this.win_level = win_level;
    }
}
