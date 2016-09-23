package com.example.danielmaina.instaweather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by danielmaina on 9/20/16.
 */
public class CityPreference {
    //THIS CLASS IMPLEMENTS THE USE OF SHARED PREFERENCES
    //create a sharedPreferences object/variable whatever;
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    //if the user has not chosen a city yet,return
    //Nairobi,kenya as the default city
    String getCity(){
        return prefs.getString("city","Nairobi");
    }
    void  setCity(String city){
        prefs.edit().putString("city",city).commit();
    }
}
