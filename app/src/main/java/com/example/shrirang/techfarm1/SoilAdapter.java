package com.example.shrirang.techfarm1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by SHRIRANG on 11/5/2017.
 */

public class SoilAdapter<S> extends ArrayAdapter<SoilC> {

    public SoilAdapter(Activity context, ArrayList<SoilC> soilCS1){
        super(context,0,soilCS1);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        SoilC soilC = getItem(position);

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.soil_list, parent, false);
        }
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img1);
        imageView.setImageBitmap(soilC.getImg());
        return  listItemView;
    }
}
