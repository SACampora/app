package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

import java.util.Timer;
import java.util.TimerTask;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {

                //Intent intent = new Intent(Splash.this,MainActivity.class);
                Intent o = new Intent(Splash.this, MainActivity.class);

                startActivity(o);
                finish();

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);

    }
}