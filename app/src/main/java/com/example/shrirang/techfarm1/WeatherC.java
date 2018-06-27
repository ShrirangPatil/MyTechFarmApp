package com.example.shrirang.techfarm1;

/**
 * Created by SHRIRANG on 10/22/2017.
 */

public class WeatherC {
    private String temp;
    private String humidity;
    private String cloud;
    private String desp;
    private String dt;

    public WeatherC(String tempP,String humidityP,String cloudP, String despP,String dtP){
        temp = tempP;
        humidity = humidityP;
        cloud = cloudP;
        desp = despP;
        dt = dtP;
    }
    public String getTemp(){
        return temp;
    }
    public String getHumidity(){
        return humidity;
    }
    public String getCloud(){
        return cloud;
    }
    public String getDesp(){
        return desp;
    }
    public String getDt(){
        return dt;
    }
}
