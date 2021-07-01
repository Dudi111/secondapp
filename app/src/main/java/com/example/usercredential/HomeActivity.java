package com.example.usercredential;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvemail=findViewById(R.id.tvshow);
        Intent intent=getIntent();
        String useremail=intent.getStringExtra("useremail");
        tvemail.setText(useremail);
    }
}