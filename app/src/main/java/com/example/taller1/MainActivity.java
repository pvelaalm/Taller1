package com.example.taller1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView greetingTextView;
    private Button buttonGoToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTextView = findViewById(R.id.greetingTextView);
        buttonGoToMain = findViewById(R.id.buttonGoToMain);

        // Cambiar el saludo según la hora del día
        setGreetingMessage();

        // Botón para navegar a la Actividad Principal
        buttonGoToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityPrincipal.class);
                startActivity(intent);
            }
        });
    }

    private void setGreetingMessage() {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay >= 6 && hourOfDay < 12) {
            greetingTextView.setText("Buenos días");
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            greetingTextView.setText("Buenas tardes");
        } else {
            greetingTextView.setText("Buenas noches");
        }
    }
}
