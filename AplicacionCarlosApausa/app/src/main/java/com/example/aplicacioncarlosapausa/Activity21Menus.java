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
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity21Menus extends AppCompatActivity {
    private Button bMenu1, bMenu2, bMenu3, bMenu4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity21_menus);

        //Buttons
        bMenu1 = (Button)findViewById(R.id.bMenu1);
        bMenu2 = (Button)findViewById(R.id.bMenu2);
        bMenu3 = (Button)findViewById(R.id.bMenu3);
        bMenu4 = (Button)findViewById(R.id.bMenu4);
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
                Toast.makeText(this,"Ya estas en MENUS", Toast.LENGTH_SHORT).show();
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
                cambioPantallaBebidas(null);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //AÑADIR AL CARRITO
    public String pedidoMenu= "";
    public int precioMenu=0;
    public void addCarritoMenu1(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Menu1", pedidoMenu +"\nMenu 1 .......................................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoMenu2(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Menu2", pedidoMenu +"\nMenu 2 .......................................... 8€");
        editorMenu.apply();
        precioMenu=precioMenu +8;
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoMenu3(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Menu3", pedidoMenu +"\nMenu 3 .......................................... 8€");
        editorMenu.apply();
        precioMenu=precioMenu +8;
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoMenu4(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Menu4", pedidoMenu +"\nMenu 4 .......................................... 8€");
        editorMenu.apply();
        precioMenu=precioMenu +8;
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    /*public void addCarrito(View view){

        String pedidoMenu= "";

        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();

        //Informacion a almacenar
        if(cbMenu1.isChecked() == true){
            editorMenu.putString("Menu1", pedidoMenu +"\nMenu 1");
        } else {
            editorMenu.putString("Menu1", "");
        }

        //Almacenar en el shared preferences
        editorMenu.apply();
    }*/
}
