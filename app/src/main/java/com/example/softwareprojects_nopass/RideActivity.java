package com.example.softwareprojects_nopass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RideActivity extends AppCompatActivity {
    TextView tvDriverName;
    TextView tvDriverCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride);
        setTitle("NoPass");
    }
}
