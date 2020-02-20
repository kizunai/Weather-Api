package com.example.demo.service.impl;

import com.example.demo.bean.Weather.Weather;
import com.example.demo.bean.Weather.WeatherBean;
import com.example.demo.bean.Weather.Weatherforecast_out;
import com.example.demo.mapper.WeatherMapper;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class WeatherServiceImpl implements WeatherService{
    @Autowired
    private WeatherMapper weatherMapper;

    @Override
    public Weatherforecast_out selectWeatherData(String city) {
        WeatherBean weather = weatherMapper.selectWeatherData(city);
        List<Weather> weatherforecast =new ArrayList<Weather>();
        if(weather.getDay_1()!=null && weather.getDay_1() != ""){
            weatherforecast.add(get_weather(weather.getDay_1(), 1));
        }
        if(weather.getDay_2()!=null && weather.getDay_2() != ""){
            weatherforecast.add(get_weather(weather.getDay_2(), 0));
        }
        if(weather.getDay_3()!=null && weather.getDay_3() != ""){
            weatherforecast.add(get_weather(weather.getDay_3(), 0));
        }
        if(weather.getDay_4()!=null && weather.getDay_4() != ""){
            weatherforecast.add(get_weather(weather.getDay_4(), 0));
        }
        if(weather.getDay_5()!=null && weather.getDay_5() != ""){
            weatherforecast.add(get_weather(weather.getDay_5(), 0));
        }
        if(weather.getDay_6()!=null && weather.getDay_6() != ""){
            weatherforecast.add(get_weather(weather.getDay_6(), 0));
        }
        if(weather.getDay_7()!=null && weather.getDay_7() != ""){
            weatherforecast.add(get_weather(weather.getDay_7(), 0));
        }
        Weatherforecast_out weatherforecast_out = new Weatherforecast_out();
        weatherforecast_out.setLocation(weather.getCity());
        weatherforecast_out.setWeatherforecast(weatherforecast);
        return weatherforecast_out;
    }

    public Weather get_weather(String day, int today){
        Weather weather = new Weather();
        List<String>day_today = Arrays.asList(day.split(","));
        String win = "";
        for (int i=0;i<day_today.size();i++){
            switch (i){
                case 0:
                    weather.setDate(day_today.get(i));
                    break;
                case 1:
                    weather.setWeather(day_today.get(i));
                    break;
                case 2:
                    weather.setMax_tem(day_today.get(i));
                    break;
                case 3:
                    weather.setMin_tem(day_today.get(i));
                    break;
                case 4:
                    weather.setWin_level(day_today.get(i));
                    break;
                case 5:
                    win = win + day_today.get(i);
                    break;

                default:
                    win = win + day_today.get(i);
            }
        }
        weather.setWin(win);
        return weather;
    }
}


