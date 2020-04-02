package com.example.softwareprojects_nopass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etDestination;
    EditText etTime;
    Button bSubmit;

    static String RIDE_KEY = "ride data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("NoPass");

        bSubmit = findViewById(R.id.bSubmit);
        etDestination = findViewById(R.id.etDestination);
        etTime = findViewById(R.id.etTime);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ride ride = new Ride(etDestination.getText().toString(), etTime.getText().toString());
                Intent intent = new Intent(MainActivity.this, RideActivity.class);
                intent.putExtra(RIDE_KEY, ride);
                startActivity(intent);
            }
        });
    }
}
