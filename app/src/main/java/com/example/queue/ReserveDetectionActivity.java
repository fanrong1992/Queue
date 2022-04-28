package com.example.queue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ReserveDetectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_detection);

        Intent intent = getIntent();
        String point = intent.getStringExtra("Point");
        Toast.makeText(getApplicationContext(), "You clicked " + point, Toast.LENGTH_SHORT).show();
    }
}