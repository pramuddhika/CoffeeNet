package com.example.testcofee4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank);

        Button btn_back2Home = findViewById(R.id.btn_back2Home);

        // Set an OnClickListener to handle the button click
        btn_back2Home.setOnClickListener(new View.OnClickListener() {
            @Override // Add this annotation
            public void onClick(View v) {
                // Create an Intent to specify the destination activity
                Intent intent = new Intent(ThankActivity.this, MainActivity.class);

                // Start the new activity with the intent
                startActivity(intent);
            }
        });


    }



}