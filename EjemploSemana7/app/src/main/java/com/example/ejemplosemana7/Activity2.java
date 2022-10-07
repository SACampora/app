package com.example.ejemplosemana7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity {
    private Bundle bundle;
    private TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvSaludo = (TextView) findViewById(R.id.tvSaludo);

        bundle = getIntent().getExtras();

        String saludo = bundle.getString("nombre");

        tvSaludo.append(" " + saludo + " :D");
    }
}
