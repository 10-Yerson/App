package com.amparo.configuraciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class animales extends AppCompatActivity {

    MediaPlayer sonido1;
    MediaPlayer sonido2;
    MediaPlayer sonido3;

    Button btnperro;
    Button btnpanda;
    Button btntigre;
    Button traduccion1;
    Button traduccion2;
    Button traduccion3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animales);


        btnperro = findViewById(R.id.btnperro);
        btnpanda = findViewById(R.id.btnpanda);
        btntigre = findViewById(R.id.btntigre);

        traduccion1 = findViewById(R.id.btnperro);
        traduccion2 = findViewById(R.id.btnpanda);
        traduccion3 = findViewById(R.id.btntigre);

        sonido1 = MediaPlayer.create(this,R.raw.perro);
        sonido2 = MediaPlayer.create(this,R.raw.oso);
        sonido3 = MediaPlayer.create(this,R.raw.tigre);


        btnperro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido1.start();
                traduccion1.setText("The Dog 🐕‍🦺");
            }
        });

        btnpanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido2.start();
                traduccion2.setText("The Panda 🐼");
            }
        });

        btntigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido3.start();
                traduccion3.setText("The Tige 🐯");
            }
        });




    }
}