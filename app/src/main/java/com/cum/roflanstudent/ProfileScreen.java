package com.cum.roflanstudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(this, SchoolSubjectsScreen.class);
        startActivity(intent);
    }
}