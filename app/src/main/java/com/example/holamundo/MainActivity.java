package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Definimos los objetos que tenemos en el diseño
    // tenemos 2 1 boton y un editText
    Button Saludar;
    EditText IngreSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Establecemos las referencias de los objetos creados
        Saludar = findViewById(R.id.btnMostrar);
        IngreSaludo = findViewById(R.id.TvIngre);

        // configuramos la funcion del boton
        Saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creamos la variable tipo String
                String make;
                // Le decimos que la variable va a igual y que lo que esta en el
                // EditText lo almacene.
                make = IngreSaludo.getText().toString();
                // Mostramos en un pequeño msj y lo concatenamos.
                Toast.makeText(MainActivity.this, "Bienvenido " + make + " a Android Studio", Toast.LENGTH_SHORT).show();
            }
        });
    }
}