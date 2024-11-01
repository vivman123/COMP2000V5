package com.example.comp2000v5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ManageHolidaysActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_holidays);

        TextView manageHolidaysTextView = findViewById(R.id.holidays_info);
        manageHolidaysTextView.setText("Manage your holidays here.\n\n" +
                "1. Request Holiday\n" +
                "2. Cancel Holiday\n" +
                "3. View Holiday Balance\n");

        Button backbuttonholiday = findViewById(R.id.backbuttonholiday);
        backbuttonholiday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManageHolidaysActivity.this,  DashboardActivity.class);
                startActivity(intent);
            }
        });

        // In a real application, i would implement logic for managing holidays
    }
}