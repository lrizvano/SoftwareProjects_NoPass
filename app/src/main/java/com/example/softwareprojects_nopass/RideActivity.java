package com.example.softwareprojects_nopass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RideActivity extends AppCompatActivity {
    TextView tvDriverName;
    TextView tvDriverCar;
    TextView tvDestination;
    TextView tvTime;
    Button bPay, bCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride);
        setTitle("NoPass");

        tvDriverName = findViewById(R.id.tvDriverName);
        tvDriverCar = findViewById(R.id.tvDriverCar);
        tvDestination = findViewById(R.id.tvDestination);
        tvTime = findViewById(R.id.tvTime);
        bPay = findViewById(R.id.bPayment);
        bCancel = findViewById(R.id.bCancel);

        Ride ride = (Ride)getIntent().getExtras().getParcelable(MainActivity.RIDE_KEY);

        tvDriverName.setText("Driver: " + ride.getDriver());
        tvDriverCar.setText("Car: " + ride.getCar());
        tvDestination.setText("Time: " + ride.getTime());
        tvTime.setText("Time: " + ride.getTime());

        bPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
