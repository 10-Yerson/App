package com.amparo.configuraciones;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {


    Button colores;
    Button animales;
    Button frutas;
    Button juegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);


        colores = findViewById(R.id.colores);
        animales = findViewById(R.id.animales);
        frutas = findViewById(R.id.frutas);
        juegos = findViewById(R.id.juegos);


        colores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext = new Intent(Menu.this,colores.class);
                startActivity(goNext);
            }
        });

        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext = new Intent(Menu.this,animales.class);
                startActivity(goNext);
            }
        });

        frutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext = new Intent(Menu.this,frutas.class);
                startActivity(goNext);
            }
        });

        juegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext = new Intent(Menu.this, Juegos.class);
                startActivity(goNext);
            }
        });




    }
}