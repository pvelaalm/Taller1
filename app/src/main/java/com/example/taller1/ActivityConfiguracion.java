package com.example.taller1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityConfiguracion extends AppCompatActivity {

    private LinearLayout layoutConfiguracion;
    private Button buttonColorRojo;
    private Button buttonColorVerde;
    private Button buttonColorAzul;
    private Button buttonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        layoutConfiguracion = findViewById(R.id.layoutConfiguracion);
        buttonColorRojo = findViewById(R.id.buttonColorRojo);
        buttonColorVerde = findViewById(R.id.buttonColorVerde);
        buttonColorAzul = findViewById(R.id.buttonColorAzul);
        buttonVolver = findViewById(R.id.buttonVolver);

        // Cambiar color de fondo al hacer clic en los botones
        buttonColorRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutConfiguracion.setBackgroundColor(Color.RED);
            }
        });

        buttonColorVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutConfiguracion.setBackgroundColor(Color.GREEN);
            }
        });

        buttonColorAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutConfiguracion.setBackgroundColor(Color.BLUE);
            }
        });

        // Volver a la pantalla de inicio
        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta actividad y regresa a la anterior
            }
        });
    }
}
