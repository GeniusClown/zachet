package com.example.gigaco;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }


    public void openTools(View v) {
        Intent intent = new Intent(this, tools.class);
        startActivity(intent);
    }

}