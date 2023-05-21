package com.example.swappernchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button swapBtn, chkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txtField1);
        txt2 = findViewById(R.id.txtField2);
        swapBtn = findViewById(R.id.button);
        chkBtn = findViewById(R.id.button2);

        swapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = txt1.getText().toString();
                txt1.setText(txt2.getText().toString());
                txt2.setText(text);
            }
        });

        chkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt1.getText().toString().equals(txt2.getText().toString())) {
                    Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                    intent.putExtra("output", "SAME");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                    intent.putExtra("output", "NOT THE SAME");
                    startActivity(intent);
                }
            }
        });
    }
}