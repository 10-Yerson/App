package com.amparo.configuraciones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // declarar variables

    TextView texto1;
    ImageView img1;
    Button btnext;

    ImageView btnwhastapp;
    ImageView btntel;
    ImageView btncorreo;

    TranslateAnimation translateAnimation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Doy poderes

        texto1 = findViewById(R.id.texto1);
        img1 = findViewById(R.id.img1);


        btnext = findViewById(R.id.btnext);

        btnwhastapp = findViewById(R.id.btnwhastapp);
        btntel = findViewById(R.id.btntel);
        btncorreo = findViewById(R.id.btncorreo);

        // Declarar variables de tipo intent

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goneNext = new Intent(MainActivity.this,Menu.class);
                startActivity(goneNext);
            }
        });

        btnwhastapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goneNext = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.link/gdb1s8"));
                startActivity(goneNext);
            }
        });

        btntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:3147532227"));
                startActivity(intent);
            }
        });

        btncorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
                intent.putExtra(Intent.EXTRA_TEXT, "Texto del correo");
                startActivity(intent);
            }
        });

        translateAnimation = new TranslateAnimation(1000,0,0,0);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        img1.startAnimation(translateAnimation);


    }
}