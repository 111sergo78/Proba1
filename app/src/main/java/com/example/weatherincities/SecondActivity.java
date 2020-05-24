package com.example.weatherincities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textViewNameOfCity, textViewHumidity, textViewWindSpeed, textViewTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        WeatherReport report = (WeatherReport)getIntent().getExtras().getSerializable("REPORT");
        initViews();
        textViewNameOfCity.setText(report.nameCity);
        textViewHumidity.setText(report.humidity);
        textViewWindSpeed.setText(report.windSpeed);
        textViewTemperature.setText(report.temperature);

    }
    public void initViews(){
            textViewNameOfCity = findViewById(R.id.idCheckBoxHumidity);
            textViewHumidity = findViewById(R.id.idCheckBoxSpeedWind);
            textViewWindSpeed = findViewById(R.id.idCheckBoxTemperature);
            textViewTemperature = findViewById(R.id.idEdit_text_name_of_city);
        }
}
