package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;


public class Info extends AppCompatActivity {
    /**
     *Botón de entrar
     */
    Button entrarr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrarr=(Button)findViewById(R.id.boton2);

        entrarr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent u = new Intent( MainActivity.this, Info.class);
                startActivity(u);

            }


        } );




    }

    public void Entraste(View view) {
        Toast.makeText(this, "entraste", Toast.LENGTH_SHORT).show();
    }
}