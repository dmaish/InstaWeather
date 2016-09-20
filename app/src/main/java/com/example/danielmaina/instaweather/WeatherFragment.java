package com.example.danielmaina.instaweather;

import android.graphics.Typeface;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by danielmaina on 9/20/16.
 */
public class WeatherFragment {
    Typeface weatherFont;

    TextView cityField;
    TextView updatedField;
    TextView detailsField;
    TextView currentTemperatureField;
    TextView weatherIcon;

    Handler handler;

    //constructor for this class
    public WeatherFragment(){
        handler=new Handler();
    }

}
