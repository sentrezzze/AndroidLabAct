package com.example.swappernchecker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OutputActivity extends AppCompatActivity {

    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        txtOutput = findViewById(R.id.txtOutput);

        Intent intent = getIntent();
        String output = intent.getStringExtra("output");

        txtOutput.setText(output);
    }
}