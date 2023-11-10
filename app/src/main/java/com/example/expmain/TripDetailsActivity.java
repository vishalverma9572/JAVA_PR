package com.example.expmain;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class TripDetailsActivity extends AppCompatActivity {

    private EditText tripNameTextView;
    private EditText tripDateTextView;
    private EditText tripDestinationTextView;
    private RecyclerView expenseRecyclerView;
    private Button addExpenseButton;
    private Button editTripButton;
    private Button deleteTripButton;
    private EditText totalExpenseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_details);

        tripNameTextView = findViewById(R.id.tripNameTextView);
        tripDateTextView = findViewById(R.id.tripDateTextView);
        tripDestinationTextView = findViewById(R.id.tripDestinationTextView);
        expenseRecyclerView = findViewById(R.id.expenseRecyclerView);
        addExpenseButton = findViewById(R.id.addExpenseButton);
        editTripButton = findViewById(R.id.editTripButton);
        deleteTripButton = findViewById(R.id.deleteTripButton);
        totalExpenseTextView = findViewById(R.id.totalExpenseTextView);

        // Implement logic to display trip details, expenses, and handle user interactions
    }
}
