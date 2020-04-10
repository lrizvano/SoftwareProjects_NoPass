package com.example.softwareprojects_nopass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaymentActivity extends AppCompatActivity {
    EditText etCardName, etCardNumber, etCardExpiration, etCardCVV;
    Button bSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        setTitle("NoPass");

        etCardName = findViewById(R.id.etCardName);
        etCardNumber = findViewById(R.id.etCardNumber);
        etCardExpiration = findViewById(R.id.etCardExpiration);
        etCardCVV = findViewById(R.id.etCardCVV);
        bSubmit = findViewById(R.id.bSubmit);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
