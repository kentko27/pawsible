package com.example.emgscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LGU_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lgu_screen);
    }
    public void npo(View view) {
        Intent intent = new Intent(this, NPO_Screen.class);
        startActivity(intent);
    }
    public void ncr(View view) {
        Intent intent = new Intent(this, NCR.class);
        startActivity(intent);
    }
}