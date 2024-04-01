package com.example.pawsible_registration;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onForgotPasswordClicked(View view) {
            Intent intent = new Intent(this, ForgotPasswordActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim .slide_out_left);
        }

    public void onCreateAnAccountClicked(View view) {
        Intent intent = new Intent(this, RegisterNameActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim .slide_out_left);
    }




}