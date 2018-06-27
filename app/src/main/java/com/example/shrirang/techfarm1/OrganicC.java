package com.example.shrirang.techfarm1;

import android.graphics.Bitmap;

/**
 * Created by SHRIRANG on 10/23/2017.
 */

public class OrganicC {
    private String title;
    private String text;
    private Bitmap image;

    public OrganicC(String str,String ti,Bitmap im){
        text = str;
        image = im;
        title = ti;
    }
    public String getText(){
        return text;
    }
    public Bitmap getImage(){
        return image;
    }
    public String getTitle(){
        return title;
    }
}
