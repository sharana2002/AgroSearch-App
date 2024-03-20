package com.example.agrosearch2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgentPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_payment);

        Button confirmButton = findViewById(R.id.button19);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToAgentFinal();
            }
        });
    }

    private void navigateToAgentFinal() {
        Intent intent = new Intent(AgentPayment.this, AgentFinal.class);
        startActivity(intent);
    }
}
