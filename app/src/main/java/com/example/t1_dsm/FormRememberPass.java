package com.example.t1_dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormRememberPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_remember_pass);

        getSupportActionBar().hide();
    }
}