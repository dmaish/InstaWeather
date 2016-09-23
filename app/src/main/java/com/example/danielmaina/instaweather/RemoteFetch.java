package com.example.danielmaina.instaweather;

import android.content.Context;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by danielmaina on 9/20/16.
 */
public class RemoteFetch {


    private static final String TAG = "DANIEL MAINA LOGS:" ;

    public static  JSONObject getJSON(Context context, String city) {
        JSONObject myJsonObject=new JSONObject();
        //define client
        OkHttpClient client = new OkHttpClient();

        //create the request
        Request request = new Request.Builder()
                .url(constantsFile.BASE_URL + city + constantsFile.MY_OPEN_WEATHER_KEY)
                .build();
        //create the call
        Call call = client.newCall(request);


        try {
            //create the response
            Response response = call.execute();
            if(response.isSuccessful()) {
                String res = response.body().string();
                myJsonObject=new JSONObject(res);
                Log.v(TAG, res);

            }

        } catch (JSONException|IOException e) {
            Log.e(TAG,"Exception caught:", e);
        }

        return myJsonObject;
    }}

