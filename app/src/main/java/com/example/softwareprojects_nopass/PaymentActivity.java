package com.example.softwareprojects_nopass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class PaymentActivity extends AppCompatActivity {
    EditText etCardName, etCardNumber, etCardExpiration, etCardCVV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        setTitle("NoPass");

        etCardName = findViewById(R.id.etCardName);
        etCardNumber = findViewById(R.id.etCardNumber);
        etCardExpiration = findViewById(R.id.etCardExpiration);
        etCardCVV = findViewById(R.id.etCardCVV);
    }
}
