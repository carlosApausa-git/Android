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

public class Activity23Segundos extends AppCompatActivity {
    private Button bHuevosFritos, bFileteTernera, bSalmon, bSecreto, bChuleton, bPatatasRevolconas,bFileteLomo, bMacarrones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity23_segundos);

        //Buttons
        bHuevosFritos = (Button)findViewById(R.id.bMenu1);
        bFileteTernera = (Button)findViewById(R.id.bMenu1);
        bSalmon = (Button)findViewById(R.id.bMenu1);
        bSecreto = (Button)findViewById(R.id.bMenu1);
        bChuleton = (Button)findViewById(R.id.bMenu1);
        bPatatasRevolconas = (Button)findViewById(R.id.bMenu1);
        bFileteLomo = (Button)findViewById(R.id.bMenu1);
        bMacarrones = (Button)findViewById(R.id.bMenu1);
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
    public void cambioPantallaPostres(View vista) {

        Intent siguiente = new Intent(this, Activity24Postres.class);

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
                Toast.makeText(this,"Ya estas en SEGUNDOS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitemPostres:
                cambioPantallaPostres(null);
                return true;
            case R.id.subitemBebidas:
                cambioPantallaBebidas(null);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //AÑADIR AL CARRITO
    public String pedidoSegundos= "";
    public void addCarritoHuevosFritos(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("HuevosFritos", pedidoSegundos +"\nHuevos fritos ................................ 6€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoFileteTernera(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("FileteTernera", pedidoSegundos +"\nFilete de ternera ........................... 6€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoSalmon(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Salmon", pedidoSegundos +"\nSalmon ......................................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoSecreto(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Secreto", pedidoSegundos +"\nSecreto ......................................... 8.50€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoChuleton(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Chuleton", pedidoSegundos +"\nChuleton ....................................... 14€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoPatatasRevolconas(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("PatatasRevolconas", pedidoSegundos +"\nPatatas revolconas ...................... 9€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoFileteLomo(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("FileteLomo", pedidoSegundos +"\nFilete de lomo ............................... 6€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoMacarrones(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Macarrones", pedidoSegundos +"\nMacarrones .................................. 6€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
}
