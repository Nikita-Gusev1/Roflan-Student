package com.cum.roflanstudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SchoolSubjectsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_subjects_screen);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}