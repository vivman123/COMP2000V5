package com.example.comp2000v5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditPersonalDetailsActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_personal_details);

        EditText nameEditText = findViewById(R.id.name_edit_text);
        EditText emailEditText = findViewById(R.id.email_edit_text);
        EditText phoneEditText = findViewById(R.id.phone_edit_text);
        Button saveButton = findViewById(R.id.save_button);

        // Sample data
        nameEditText.setText("John Doe");
        emailEditText.setText("johndoe@example.com");
        phoneEditText.setText("07891011123");

        saveButton.setOnClickListener(view -> {
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();

            // Demo the saving data
            Toast.makeText(EditPersonalDetailsActivity.this, "Details saved: " + name + ", " + email, Toast.LENGTH_SHORT).show();
            // Go back to the main dashboard
            finish();
        });

        Button backbuttonedit = findViewById(R.id.backbuttonedit);
        backbuttonedit.setOnClickListener(v -> {
            Intent intent = new Intent(EditPersonalDetailsActivity.this,  DashboardActivity.class);
            startActivity(intent);
        });
    }
}