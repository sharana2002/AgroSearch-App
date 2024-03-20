package com.example.agrosearch2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agrosearch2.CustomerPaymentActivity;
import com.example.agrosearch2.R;

public class CustomerFunctionActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_function);

        Button rentButton1 = findViewById(R.id.button11);
        Button rentButton2 = findViewById(R.id.button12);
        Button rentButton3 = findViewById(R.id.button13);
        Button rentButton4 = findViewById(R.id.button14);
        Button rentButton5 = findViewById(R.id.button15);
        Button rentButton6 = findViewById(R.id.button16);
        Button rentButton7 = findViewById(R.id.button17);
        Button rentButton8 = findViewById(R.id.button18);

        rentButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });

        rentButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCustomerPayment();
            }
        });
    }

    private void navigateToCustomerPayment() {
        Intent intent = new Intent(CustomerFunctionActivity2.this, CustomerPaymentActivity.class);
        startActivity(intent);
    }
}
