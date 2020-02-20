package com.example.aplicacioncarlosapausa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();   //Para ocultar el action bar unicamente en este activity
    }
    public void cambioPantallaPrincipal(View vista) {

        Intent siguiente = new Intent(this, Activity1Principal.class);

        startActivity(siguiente);
    }
}

