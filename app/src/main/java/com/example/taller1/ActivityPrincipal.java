package com.example.taller1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPrincipal extends AppCompatActivity {

    private EditText editTextNombre;
    private TextView textViewNombre;
    private Button buttonGuardarNombre;
    private Button buttonGoToConfiguracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        editTextNombre = findViewById(R.id.editTextNombre);
        textViewNombre = findViewById(R.id.textViewNombre);
        buttonGuardarNombre = findViewById(R.id.buttonGuardarNombre);
        buttonGoToConfiguracion = findViewById(R.id.buttonGoToConfiguracion);

        buttonGuardarNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                textViewNombre.setText("Nombre ingresado: " + nombre);
            }
        });

        buttonGoToConfiguracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPrincipal.this, ActivityConfiguracion.class);
                startActivity(intent);
            }
        });
    }
}
