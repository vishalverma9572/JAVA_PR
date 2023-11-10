package com.example.expmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when "New Trip" is clicked
    public void onNewTripClick(View view) {
        Intent intent = new Intent(this, NewTripActivity.class);
        startActivity(intent);
    }

    // Called when "Previous Trips" is clicked
    public void onPreviousTripsClick(View view) {
        Intent intent = new Intent(this, PreviousTripsActivity.class);
        startActivity(intent);
    }
}
