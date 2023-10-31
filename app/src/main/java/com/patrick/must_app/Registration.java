package com.patrick.must_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    TextView txtlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        txtlogin=findViewById(R.id.txtlogn);
        Intent intent=new Intent(Registration.this,MainActivity.class);
        startActivity(intent);
    }
}