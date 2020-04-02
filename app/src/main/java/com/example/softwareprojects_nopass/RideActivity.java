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

        tvDriverName = findViewById(R.id.tvDriverName);
        tvDriverCar = findViewById(R.id.tvDriverCar);

        Ride ride = (Ride)getIntent().getExtras().getParcelable(MainActivity.RIDE_KEY);

        tvDriverName.setText("Driver: " + ride.getDriver());
        tvDriverCar.setText("Car: " + ride.getCar());
    }
}
