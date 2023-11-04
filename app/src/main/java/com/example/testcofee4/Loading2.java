package com.example.testcofee4;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;

public class Loading2 extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading2);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(Loading2.this, Loading3.class );
                startActivity(intent);
                finish();

            }
        },1500);

    }
}