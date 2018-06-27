package com.example.shrirang.techfarm1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SoilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soil);

        ArrayList<SoilC> soilCS = new ArrayList<>();

        Bitmap bitmap1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.im1);
        soilCS.add(new SoilC(bitmap1));
        Bitmap bitmap2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.im2);
        soilCS.add(new SoilC(bitmap2));
        Bitmap bitmap3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.img3);
        soilCS.add(new SoilC(bitmap3));
        Bitmap bitmap4 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.img4);
        soilCS.add(new SoilC(bitmap4));
        Bitmap bitmap5 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.img5);
        soilCS.add(new SoilC(bitmap5));
        Bitmap bitmap6 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.img6);
        soilCS.add(new SoilC(bitmap6));
        Bitmap bitmap7 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.img7);
        soilCS.add(new SoilC(bitmap7));
        Bitmap bitmap8 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.img8);
        soilCS.add(new SoilC(bitmap8));

        SoilAdapter<SoilC> soilCSoilAdapter = new SoilAdapter<SoilC>(this,soilCS);
        ListView listView = (ListView) findViewById(R.id.soil_list);
        listView.setAdapter(soilCSoilAdapter);
    }
}
