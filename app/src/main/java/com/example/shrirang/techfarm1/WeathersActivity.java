package com.example.shrirang.techfarm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class WeathersActivity extends AppCompatActivity {

    String cityid = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weathers);
    }
    public void onRadioButtonClicked(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.belagavi:
                if (checked)
                    cityid = "1276533";
                    break;
            case R.id.bagalkot:
                if (checked)
                    cityid = "1277936";
                    break;
            case R.id.chikodi:
                if (checked)
                    cityid = "1274218";
                    break;
            case R.id.bengaluru:
                if (checked)
                    cityid = "1277333";
                break;
            case R.id.hubli:
                if (checked)
                    cityid = "1269920";
                break;

            case R.id.mysore:
                if (checked)
                    cityid = "1262321";
                break;
            case R.id.tumkur:
                if (checked)
                    cityid = "1254089";
                break;

            case R.id.madikeri:
                if (checked)
                    cityid = "1264540";
                break;

            case R.id.badami:
                if (checked)
                    cityid = "1278017";
                break;
            default:
                cityid = "0";
        }
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cityid != "0"){
                    Intent intent = new Intent(WeathersActivity.this, Weather.class);
                    intent.putExtra("EXTRA_SESSION_ID", cityid);
                    startActivity(intent);
                }
        }
        });

    }
}
