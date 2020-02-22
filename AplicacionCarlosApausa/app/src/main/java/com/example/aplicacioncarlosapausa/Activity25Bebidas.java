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
import android.widget.Toast;

public class Activity25Bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity25_bebidas);
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
    public void cambioPantallaPostres(View vista) {

        Intent siguiente = new Intent(this, Activity24Postres.class);

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
                cambioPantallaPostres(null);
                return true;
            case R.id.subitemBebidas:
                Toast.makeText(this,"Ya estas en BEBIDAS", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //AÑADIR AL CARRITO
    public String pedidoBebidas= "";
    public void addCarritoAgua(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Agua", pedidoBebidas +"\nAgua .............................................. 1.50€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoCerveza(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Cerveza", pedidoBebidas +"\nCerveza ......................................... 1.20€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoCocaCola(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("CocaCola", pedidoBebidas +"\nCocaCola ....................................... 2€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoAquarius(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Aquarius", pedidoBebidas +"\nAquarius ........................................ 2€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoFantaNaranja(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("FantaNaranja", pedidoBebidas +"\nFanta de naranja ........................... 2€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoFantaLimon(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("FantaLimon", pedidoBebidas +"\nFanta de limon .............................. 2€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoNestea(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Nestea", pedidoBebidas +"\nNestea ........................................... 2€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoSprite(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Sprite", pedidoBebidas +"\nSprite ............................................. 2€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
}
