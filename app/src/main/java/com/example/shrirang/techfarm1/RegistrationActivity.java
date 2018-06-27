package com.example.shrirang.techfarm1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText phno = (EditText) findViewById(R.id.ph_no);
        Button register = (Button) findViewById(R.id.reg);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String un = username.getText().toString();
                String pn = phno.getText().toString();
                SharedPreferences.Editor editor = getSharedPreferences("Registration", MODE_PRIVATE).edit();
                editor.putString("name", un);
                editor.putString("idName", pn);
                editor.apply();
                String result = "Registration Successful";
                Toast.makeText(RegistrationActivity.this,
                        result,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                phno.setText("");
            }
        });
    }
}
