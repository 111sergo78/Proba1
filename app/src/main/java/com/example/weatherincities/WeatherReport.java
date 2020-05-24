package com.example.weatherincities;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class WeatherReport implements Serializable {

    public String nameCity;
    public String humidity;
    public String windSpeed;
    public int temperature;

    public WeatherReport(){
        this.nameCity = nameCity;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
    }

}

