package com.example.demo.service;

import com.example.demo.bean.Weather.Weatherforecast_out;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {
    Weatherforecast_out selectWeatherData(String city);
}
