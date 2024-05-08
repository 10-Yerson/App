package com.amparo.configuraciones;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Juegos extends AppCompatActivity {

    ImageView imgmanzana;


    ImageView imgerror;
    ImageView imgerror1;
    ImageView imgerror2;



    MediaPlayer sonido1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_juegos);

        sonido1 = MediaPlayer.create(this,R.raw.error);

        imgmanzana = findViewById(R.id.imgmanzana);
        imgerror = findViewById(R.id.imgerror);
        imgerror1 = findViewById(R.id.imgerror1);
        imgerror2 = findViewById(R.id.imgerror2);



                imgmanzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext = new Intent(Juegos.this, juegoApple.class);
                startActivity(goNext);
            }
        });


        imgerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido1.start();
            }
        });

        imgerror1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido1.start();
            }
        });

        imgerror2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido1.start();
            }
        });






    }
}