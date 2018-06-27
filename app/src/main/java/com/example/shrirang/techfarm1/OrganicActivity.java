package com.example.shrirang.techfarm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class OrganicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic);

        LinearLayout oi = (LinearLayout) findViewById(R.id.oi);
        oi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "Organic Information",Toast.LENGTH_SHORT).show();
                Intent organic_info = new Intent(OrganicActivity.this,OrganicInfo.class);
                startActivity(organic_info);
            }
        });
        LinearLayout ss = (LinearLayout) findViewById(R.id.ss);
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "Success Stories",Toast.LENGTH_SHORT).show();
                Intent stories_info = new Intent(OrganicActivity.this,StoriesActivity.class);
                startActivity(stories_info);
            }
        });

    }
}
