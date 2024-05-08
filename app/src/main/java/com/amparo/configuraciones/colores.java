package com.amparo.configuraciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class colores extends AppCompatActivity {

    MediaPlayer sonido1;
    MediaPlayer sonido2;
    MediaPlayer sonido3;


    TextView colorazul;
    TextView colorverde;
    TextView colorojo;

    TextView traduccion1;
    TextView traduccion2;
    TextView traduccion3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_colores);

        colorazul = findViewById(R.id.colorazul);
        colorverde = findViewById(R.id.colorverde);
        colorojo = findViewById(R.id.colorojo);


        sonido1 = MediaPlayer.create(this,R.raw.blue);
        sonido2 = MediaPlayer.create(this,R.raw.verde);
        sonido3 = MediaPlayer.create(this,R.raw.red);

        traduccion1 = findViewById(R.id.colorazul);
        traduccion2 = findViewById(R.id.colorverde);
        traduccion3 = findViewById(R.id.colorojo);

        colorazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido1.start();
                traduccion1.setText("Color Azul 💙");


            }
        });

        colorverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido2.start();
                traduccion2.setText("Color Verde 💚");

            }
        });

        colorojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido3.start();
                traduccion3.setText("Color Rojo ❤️ ");

            }
        });
    }
}