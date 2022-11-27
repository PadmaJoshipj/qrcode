package com.example.qrreadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView qrcode;
  Button gen, scan;
  ImageView qr;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qr = findViewById(R.id.an1);
        gen = findViewById(R.id.bt);
        scan = findViewById(R.id.btn);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = qrcode.toString();


            }
        });





    }
}