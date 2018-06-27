package com.example.shrirang.techfarm1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final TextView t = (TextView) findViewById(R.id.textView);


        SharedPreferences prefs = getSharedPreferences("Registration", MODE_PRIVATE);
        final String name = prefs.getString("name", null);//"No name defined" is the default value.
        if (name != null) {
            //name = prefs.getString("name", "No name defined");//"No name defined" is the default value.
            String phn = prefs.getString("idName", "No phone number"); //0 is the default value.

            ImageButton imb = (ImageButton) findViewById(R.id.person);
            imb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),
                            "Hello\n"+name,Toast.LENGTH_SHORT).show();
                }
            });
            final String w = "Weather";
            LinearLayout weather = (LinearLayout) findViewById(R.id.weather);
            weather.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //t.setText(w);
                    Toast.makeText(v.getContext(),
                            w,Toast.LENGTH_SHORT).show();
                    Intent weatherintent = new Intent(MainActivity.this,WeathersActivity.class);
                    startActivity(weatherintent);
                }
            });

            final String sr = "Soil Report";
            LinearLayout soil = (LinearLayout) findViewById(R.id.soil);
            soil.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    //t.setText(sr);
                    Toast.makeText(v.getContext(),
                            sr,Toast.LENGTH_SHORT).show();
                    Intent soilactivity = new Intent(MainActivity.this,SoilActivity.class);
                    startActivity(soilactivity);
                }
            });

            final String of = "Organic Farming";
            LinearLayout organic = (LinearLayout) findViewById(R.id.organic);
            organic.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    //t.setText(of);
                    Toast.makeText(v.getContext(),
                            of,Toast.LENGTH_SHORT).show();
                    Intent organicactivity = new Intent(MainActivity.this,OrganicActivity.class);
                    startActivity(organicactivity);
                }
            });
        }
        else {
            Intent intent = new Intent(this, RegistrationActivity.class);
            startActivity(intent);
        }


    }
}
