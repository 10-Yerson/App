package com.amparo.configuraciones;

import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class frutas extends AppCompatActivity {

    TranslateAnimation translateAnimation;
    TextView frutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frutas);

        frutas=findViewById(R.id.frutas);

        translateAnimation = new TranslateAnimation(1000,0,0,0);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        frutas.startAnimation(translateAnimation);

    }
}