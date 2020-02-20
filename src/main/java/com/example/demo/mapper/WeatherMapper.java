package com.example.demo.mapper;

import com.example.demo.bean.Weather.WeatherBean;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherMapper {
    WeatherBean selectWeatherData(String city);
}
