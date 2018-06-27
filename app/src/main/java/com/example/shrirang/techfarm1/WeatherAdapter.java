package com.example.shrirang.techfarm1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SHRIRANG on 10/22/2017.
 */

public class WeatherAdapter<WC>  extends ArrayAdapter<WeatherC> {
    public WeatherAdapter(Activity context, ArrayList<WeatherC> word){
        super(context,0,word);
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        //int humi;
        WeatherC currentW = getItem(position);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.weatherlist, parent, false);
        }
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_w);
        if (currentW.getCloud().equals("Rain")) {
            imageView.setImageResource(R.drawable.rain_icon);
        } else if (currentW.getCloud().equals("Clear")) {
            imageView.setImageResource(R.drawable.clear_icon);
        } else if (currentW.getCloud().equals("Clouds")) {
            imageView.setImageResource(R.drawable.cloudy_icon);
        } else {
            imageView.setImageResource(R.drawable.else_icon);
        }
        //imageView.setBackgroundColor(Color.parseColor("#B3E5FC"));

        TextView tempTextView = (TextView) listItemView.findViewById(R.id.temp);
        tempTextView.setText(currentW.getTemp());

        TextView humidityTextView = (TextView) listItemView.findViewById(R.id.humidity);
        humidityTextView.setText(currentW.getHumidity());

        TextView cloudTextView = (TextView) listItemView.findViewById(R.id.clouds);
        cloudTextView.setText(currentW.getCloud());

        TextView despTextView = (TextView) listItemView.findViewById(R.id.desp);
        despTextView.setText(currentW.getDesp());

        TextView dtTextView = (TextView) listItemView.findViewById(R.id.dt);
        dtTextView.setText(currentW.getDt());

    return listItemView;
    }
}
