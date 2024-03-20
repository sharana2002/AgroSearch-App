package com.example.agrosearch2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class OwnerFunctionActivity extends AppCompatActivity {

    EditText itemNameEditText, modelNameEditText, yearEditText, priceEditText;
    CheckBox rentCheckBox, saleCheckBox;
    Button addItemButton, delItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_function);

        itemNameEditText = findViewById(R.id.editTextText25);
        modelNameEditText = findViewById(R.id.editTextText26);
        yearEditText = findViewById(R.id.editTextText27);
        priceEditText = findViewById(R.id.editTextText29);
        rentCheckBox = findViewById(R.id.checkBox);
        saleCheckBox = findViewById(R.id.checkBox2);
        addItemButton = findViewById(R.id.button20);
        delItemButton = findViewById(R.id.button21);

        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get all the entered information
                String itemName = itemNameEditText.getText().toString();
                String modelName = modelNameEditText.getText().toString();
                String year = yearEditText.getText().toString();
                String price = priceEditText.getText().toString();
                boolean isRentSelected = rentCheckBox.isChecked();
                boolean isSaleSelected = saleCheckBox.isChecked();

                // Check if all required information is entered
                if (!itemName.isEmpty() && !modelName.isEmpty() && !year.isEmpty() && !price.isEmpty()) {
                    // Navigate to OwnerAddActivity and pass the information
                    Intent intent = new Intent(OwnerFunctionActivity.this, OwnerAddActivity.class);
                    intent.putExtra("itemName", itemName);
                    intent.putExtra("modelName", modelName);
                    intent.putExtra("year", year);
                    intent.putExtra("price", price);
                    intent.putExtra("isRentSelected", isRentSelected);
                    intent.putExtra("isSaleSelected", isSaleSelected);
                    startActivity(intent);
                }
            }
        });

        delItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OwnerDelActivity when the Del Item button is clicked
                Intent intent = new Intent(OwnerFunctionActivity.this, OwnerDelActivity.class);
                startActivity(intent);
            }
        });
    }
}
