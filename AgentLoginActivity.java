package com.example.agrosearch2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agrosearch2.R;

public class AgentLoginActivity extends AppCompatActivity {

    EditText editTextAgentId, editTextPassword;
    Button buttonLogin, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_login);

        editTextAgentId = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.button2);
        buttonSignUp = findViewById(R.id.button6);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String agentId = editTextAgentId.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Dummy authentication (remove hardcoded validation)
                // You can perform your actual authentication logic here
                if (isValidCredentials(agentId, password)) {
                    // Authentication successful
                    Toast.makeText(AgentLoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent loggedInIntent = new Intent(AgentLoginActivity.this, AgentList.class);
                    startActivity(loggedInIntent);
                    finish();
                } else {
                    // Authentication failed
                    Toast.makeText(AgentLoginActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgentLoginActivity.this, AgentSignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    // Dummy method for validating credentials (replace with your actual authentication logic)
    private boolean isValidCredentials(String agentId, String password) {
        // Dummy validation logic: any non-empty agentId and password is considered valid
        return !agentId.isEmpty() && !password.isEmpty();
    }
}
