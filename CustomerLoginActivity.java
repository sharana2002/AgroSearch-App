package com.example.agrosearch2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agrosearch2.R;

public class CustomerLoginActivity extends AppCompatActivity {

    EditText editTextUserName, editTextPassword;
    Button buttonLogin, buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        editTextUserName = findViewById(R.id.editTextText2);
        editTextPassword = findViewById(R.id.editTextText3);
        buttonLogin = findViewById(R.id.button3);
        buttonSignup = findViewById(R.id.button5);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editTextUserName.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Perform login authentication (remove hardcoded validation)
                // You can perform your actual authentication logic here
                if (isValidLogin(userName, password)) {
                    // Login successful
                    Toast.makeText(CustomerLoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CustomerLoginActivity.this, CustomerFunctionActivity2.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Login failed
                    Toast.makeText(CustomerLoginActivity.this, "Invalid credentials. Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerLoginActivity.this, CustomerSignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    // Dummy method for simulating login authentication (replace with your actual authentication logic)
    private boolean isValidLogin(String userName, String password) {
        // Dummy validation logic: any non-empty username and password is considered valid
        return !userName.isEmpty() && !password.isEmpty();
    }
}
