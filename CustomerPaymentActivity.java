package com.example.agrosearch2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CustomerPaymentActivity extends AppCompatActivity {

    EditText editTextUPI, editTextMobile, editTextAccountHolder;
    Button buttonOrderConfirmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_payment);

        editTextUPI = findViewById(R.id.editTextText22);
        editTextMobile = findViewById(R.id.editTextText23);
        editTextAccountHolder = findViewById(R.id.editTextText24);
        buttonOrderConfirmed = findViewById(R.id.button19);

        buttonOrderConfirmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String upi = editTextUPI.getText().toString().trim();
                String mobile = editTextMobile.getText().toString().trim();
                String accountHolder = editTextAccountHolder.getText().toString().trim();

                if (upi.isEmpty() || mobile.isEmpty() || accountHolder.isEmpty()) {
                    Toast.makeText(CustomerPaymentActivity.this, "Please enter all information", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(CustomerPaymentActivity.this, CustomerFinalActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
