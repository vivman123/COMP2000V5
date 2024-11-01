package com.example.comp2000v5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ViewPersonalDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_personal_details);

        // Simulated user data
        String userName = "John Doe"; // You can fetch this from a database or shared preferences
        String email = "johndoe@example.com";
        String phone = "07891011123";

        // Display user data in the TextView
        TextView detailsTextView = findViewById(R.id.details_text_view);
        detailsTextView.setText("User Name: " + userName + "\nEmail: " + email + "\nPhone: " + phone);

        Button backbuttonview = findViewById(R.id.backbuttonview);
        backbuttonview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewPersonalDetailsActivity.this,  DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}