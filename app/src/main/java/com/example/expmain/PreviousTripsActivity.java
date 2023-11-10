package com.example.expmain;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PreviousTripsActivity extends AppCompatActivity {

    private RecyclerView tripRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_trips);

        tripRecyclerView = findViewById(R.id.tripRecyclerView);

        // Implement logic to populate the RecyclerView with previous trips
    }
}
