package com.example.aplicacioncarlosapausa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity24Postres extends AppCompatActivity {
    private Button bHeladoFresa, bFlan, bTartaZanahoria, bSandia, bMouseLimon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity24_postres);
        bHeladoFresa = (Button)findViewById(R.id.bHeladoFresa);
        bFlan = (Button)findViewById(R.id.bHeladoFresa);
        bTartaZanahoria = (Button)findViewById(R.id.bHeladoFresa);
        bSandia = (Button)findViewById(R.id.bHeladoFresa);
        bMouseLimon = (Button)findViewById(R.id.bHeladoFresa);
    }

    //----------------------------------------------------------------------------------------------
    //CAMBIO DE ACTIVITY funciones de los botones para cambiar de activity
    //----------------------------------------------------------------------------------------------
    public void cambioPantallaCarrito(View vista) {

        Intent siguiente = new Intent(this, Activity5Carrito.class);

        startActivity(siguiente);
    }
    public void cambioPantallaPrincipal(View vista) {

        Intent siguiente = new Intent(this, Activity1Principal.class);

        startActivity(siguiente);
    }
    public void cambioPantallaComida(View vista) {

        Intent siguiente = new Intent(this, Activity2Comida.class);

        startActivity(siguiente);
    }
    public void cambioPantallaGaleria(View vista) {

        Intent siguiente = new Intent(this, Activity31Galeria.class);

        startActivity(siguiente);
    }
    public void cambioPantallaUbicacion(View vista) {

        Intent siguiente = new Intent(this, ActivityMaps.class);

        startActivity(siguiente);
    }
    public void cambioPantallaContacto(View vista) {

        Intent siguiente = new Intent(this, ActivityContacto.class);

        startActivity(siguiente);
    }
    public void cambioPantallaMenus(View vista) {

        Intent siguiente = new Intent(this, Activity21Menus.class);

        startActivity(siguiente);
    }
    public void cambioPantallaPrimeros(View vista) {

        Intent siguiente = new Intent(this, Activity22Primeros.class);

        startActivity(siguiente);
    }
    public void cambioPantallaSegundos(View vista) {

        Intent siguiente = new Intent(this, Activity23Segundos.class);

        startActivity(siguiente);
    }
    public void cambioPantallaBebidas(View vista) {

        Intent siguiente = new Intent(this, Activity25Bebidas.class);

        startActivity(siguiente);
    }
    //----------------------------------------------------------------------------------------------
    //OPCIONES DEL ACTION BAR MENU SUPERIOR
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.itemcCarrito:
                cambioPantallaCarrito(null);
                return true;
            case R.id.itemMenuPrincipal:
                cambioPantallaPrincipal(null);
                return true;
            case R.id.itemComida:
                return true;
            case R.id.itemGaleria:
                cambioPantallaGaleria(null);
                return true;
            case R.id.itemUbicacion:
                cambioPantallaUbicacion(null);
                return true;
            case R.id.itemContacto:
                cambioPantallaContacto(null);
                return true;
            case R.id.subitemMenus:
                cambioPantallaMenus(null);
                return true;
            case R.id.subitemPrimeros:
                cambioPantallaPrimeros(null);
                return true;
            case R.id.subitemSegundos:
                cambioPantallaSegundos(null);
                return true;
            case R.id.subitemPostres:
                Toast.makeText(this,"Ya estas en POSTRES", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitemBebidas:
                cambioPantallaBebidas(null);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //AÑADIR AL CARRITO
    public String pedidoPostres= "";
    public void addCarritoHeladoFresa(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("HeladoFresa", pedidoPostres +"\nHelado de fresa ........................... 3.50€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoFlanQueso(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("FlanQueso", pedidoPostres +"\nFlan de queso ............................... 3€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoTartaZanahoria(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("TartaZanahoria", pedidoPostres +"\nTarta de zanahoria ....................... 4€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoSandia(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Sandia", pedidoPostres +"\nSandia ........................................... 3.50€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoMousseLimon(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("MousseLimon", pedidoPostres +"\nMousse de limon ......................... 4€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
}
