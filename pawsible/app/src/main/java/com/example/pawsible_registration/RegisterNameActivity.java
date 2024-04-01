package com.example.pawsible_registration;

import androidx.appcompat.app.AppCompatActivity;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_name);

        TextInputLayout layoutPassword = findViewById(R.id.textInputLayout6);
        TextInputEditText eTextPassword = findViewById(R.id.register_middlename);

        eTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String password = charSequence.toString();
                if (password.length() >= 8) {
                    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                    Matcher matcher = pattern.matcher(password);
                    boolean isPwdContainsSpeChar = matcher.find();
                    if(isPwdContainsSpeChar){
                        layoutPassword.setHelperText("Strong Password");
                        layoutPassword.setHelperTextColor(ColorStateList.valueOf(Color.parseColor("teal")));
                        layoutPassword.setError("");
                    }else{
                        layoutPassword.setHelperText("");
                        layoutPassword.setError("Weak Password Include 1 special char");
                    }

                }else{
                    layoutPassword.setHelperText("Enter Minimum 8 char");
                    layoutPassword.setError("");
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }


    public void onLoginHereClicked(View view) {
        finish();


    }
}