package com.example.weatherincities;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import static com.example.weatherincities.R.string.humidity1;

public class StartSecondActivity implements View.OnClickListener {

    private Activity sourceActivity;
    CheckBox checkBoxHumidity, checkBoxSpeedWind, checkBoxTemperature;
    EditText etxtName;

    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }



    @Override
    public void onClick(View view) {
        WeatherReport report = new WeatherReport();
        initViews();
        report.nameCity = etxtName.getText().toString();
        report.humidity = (checkBoxHumidity.isChecked()String.valueOf(humidity1);
        report.windSpeed = toString(checkBoxSpeedWind.isChecked();
        report.temperature = Integer.parseInt(checkBoxTemperature.isChecked();
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra("REPORT", report);
        sourceActivity.startActivity(intent);
    }

    public  void initViews() {
        checkBoxHumidity = sourceActivity.findViewById(R.id.idCheckBoxHumidity);
        checkBoxSpeedWind = sourceActivity.findViewById(R.id.idCheckBoxSpeedWind);
        checkBoxTemperature = sourceActivity.findViewById(R.id.idCheckBoxTemperature);
        etxtName = sourceActivity.findViewById(R.id.idEdit_text_name_of_city);
    }

}


