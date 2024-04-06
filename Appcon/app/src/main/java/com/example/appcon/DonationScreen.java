package com.example.appcon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DonationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donation_screen);
    }
    public void donate1(View view) {
        Intent intent = new Intent(this, DonationInfo.class);
        startActivity(intent);
    }
}