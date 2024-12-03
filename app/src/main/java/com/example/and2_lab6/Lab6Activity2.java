package com.example.and2_lab6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab6Activity2 extends AppCompatActivity {

    Button btnStart, btnStop, btnBackgroundservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab62);
        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        btnBackgroundservice = findViewById(R.id.btnBackgroundService);

        btnStart.setOnClickListener(view -> {
            startService(new Intent(Lab6Activity2.this, ForcegroundService.class));
        });
        btnStop.setOnClickListener(view -> {
            startService(new Intent(Lab6Activity2.this, ForcegroundService.class));
        });
        btnBackgroundservice.setOnClickListener(view -> {
            startService(new Intent(Lab6Activity2.this, BackGroundService.class));
        });
    }
}