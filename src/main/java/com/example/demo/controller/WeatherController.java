package com.example.demo.controller;

import com.example.demo.bean.Weather.Weatherforecast_out;
import com.example.demo.service.impl.WeatherServiceImpl;
import com.example.demo.tool.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherServiceImpl weatherServiceimpl;

    @RequestMapping(value = "/weatherforecast", method = RequestMethod.GET)
    public JSONResult weatherForecast(String location){
        Weatherforecast_out weatherforecast_out = weatherServiceimpl.selectWeatherData(location);
        return JSONResult.success(weatherforecast_out);
    }
}
