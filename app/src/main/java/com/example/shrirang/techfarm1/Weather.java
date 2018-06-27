package com.example.shrirang.techfarm1;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Weather extends AppCompatActivity {

    WeatherAdapter<WeatherC> weatherAdapter;
    //public static final String LOG_TAG = Weather.class.getName();
    static int city_id = 1276533;
    private static String url_OW;// = "http://api.openweathermap.org/data/2.5/forecast?id="+city_id+"&APPID=key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        /*for(int i = 0;i<10;i++){
            weatherCs.add(new WeatherC("day","humidity","clouds","desp","dt"));
        }*/
        try {
            String city_Id = getIntent().getStringExtra("EXTRA_SESSION_ID");
            city_id = Integer.parseInt(city_Id);

        }catch (Exception e){

        }
        url_OW = "http://api.openweathermap.org/data/2.5/forecast?id="+city_id+"&APPID=79bea81300658a983c2a35354b4a2634";
        weatherAdapter = new WeatherAdapter<>(this,new ArrayList<WeatherC>());

        ListView listView = (ListView) findViewById(R.id.weather_list);
        WeatherAsyncTask task = new WeatherAsyncTask();
        task.execute(url_OW);

        listView.setAdapter(weatherAdapter);
    }
    private class WeatherAsyncTask extends AsyncTask<String, Void, ArrayList<WeatherC>> {
        AlertDialog.Builder builder;
        AlertDialog dialog;
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            builder = new AlertDialog.Builder(Weather.this);
            builder.setMessage("PleaseWait!").setTitle("Loading...");
            builder.setCancelable(false);
            dialog = builder.create();
            dialog.show();
        }
        @Override
        protected ArrayList<WeatherC> doInBackground(String... urls) {
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            ArrayList<WeatherC> result = WeatherUtils.weatherString(urls[0]);
            return result;
        }

        @Override
        protected void onPostExecute(ArrayList<WeatherC> data) {
            dialog.dismiss();
            weatherAdapter.clear();
            if (data != null && !data.isEmpty()) {
                weatherAdapter.addAll(data);
            }
        }
    }
}
