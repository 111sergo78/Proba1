package com.example.weatherincities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch;
    Button buttonSecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = findViewById(R.id.idSwitch);
        buttonSecondActivity = findViewById(R.id.button_start_secondActivity);


    }
    public void startActivity(){
        buttonSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSecondActivity.setOnClickListener(new StartSecondActivity(this, SecondActivity.class));
            }
        });
    }


    //public void setOnCheckBox() {
        //aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            //@Override
            //public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            //}
        //});
        //if(aSwitch.isChecked()){
            //checkBoxHumidity.setVisibility(View.VISIBLE);
            //checkBoxSpeedWind.setVisibility(View.VISIBLE);
            //checkBoxTemperature.setVisibility(View.VISIBLE);
        //}else{
            //checkBoxHumidity.setVisibility(View.INVISIBLE);
            //checkBoxSpeedWind.setVisibility(View.INVISIBLE);
            //checkBoxTemperature.setVisibility(View.INVISIBLE);
        //}
    //}
}
