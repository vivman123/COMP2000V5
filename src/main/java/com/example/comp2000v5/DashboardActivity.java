package com.example.comp2000v5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        Button viewPersonalDetailsButton = findViewById(R.id.view_personal_details_button);
        viewPersonalDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ViewPersonalDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button editPersonalDetailsButton = findViewById(R.id.edit_personal_details_button);
        editPersonalDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, EditPersonalDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button manageHolidaysButton = findViewById(R.id.manage_holidays_button);
        manageHolidaysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ManageHolidaysActivity.class);
                startActivity(intent);
            }
        });

        Button backbuttonmain = findViewById(R.id.backbuttonmain);
        backbuttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this,  MainActivity.class);
                startActivity(intent);
            }
        });

    }
}