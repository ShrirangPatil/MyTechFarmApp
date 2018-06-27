package com.example.shrirang.techfarm1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SHRIRANG on 10/23/2017.
 */

public class OrganicAdapter<OC> extends ArrayAdapter<OrganicC>{

    public OrganicAdapter(Context context, ArrayList<OrganicC> word){
        super(context,0,word);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        OrganicC organicC = getItem(position);

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.organic_list, parent, false);
        }
        TextView orgTitleView = (TextView) listItemView.findViewById(R.id.orgTitle);
        orgTitleView.setText(organicC.getTitle());

        TextView orgTextView = (TextView) listItemView.findViewById(R.id.orgText);
        orgTextView.setText(organicC.getText());

        ImageView orgImageView = (ImageView) listItemView.findViewById(R.id.orgImage);
        orgImageView.setImageBitmap(organicC.getImage());
        return listItemView;
    }
}
