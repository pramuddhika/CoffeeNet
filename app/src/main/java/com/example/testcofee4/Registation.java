package com.example.testcofee4;

import static com.example.testcofee4.R.id.btn_log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registation extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);

        Button btn_log = findViewById(R.id.btn_log);

        // Set an OnClickListener to handle the button click
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override // Add this annotation
            public void onClick(View v) {
                // Create an Intent to specify the destination activity
                Intent intent = new Intent(Registation.this, Login.class);

                // Start the new activity with the intent
                startActivity(intent);
            }
        });


    }
}