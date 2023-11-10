package com.example.expmain;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class NewTripActivity extends AppCompatActivity {

    private EditText tripNameInput;
    private EditText destinationInput;
    private EditText dateInput;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip);

        tripNameInput = findViewById(R.id.tripNameInput);
        destinationInput = findViewById(R.id.destinationInput);
        dateInput = findViewById(R.id.dateInput);
        submitButton = findViewById(R.id.submitTripButton);
    }

    public void onSubmitTripClick(View view) {
        // Implement logic to save the new trip details and return to the home page
    }
}
