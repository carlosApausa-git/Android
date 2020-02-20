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

public class Activity22Primeros extends AppCompatActivity {
    private Button bSopaVerduras, bEnsaladaFruta, bGazpacho, bMigas, bEnsaladaPiniones, bSopaCocido, bPureVerduras, bJudias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity22_primeros);

        //Buttons
        bSopaVerduras = (Button)findViewById(R.id.bSopaVerduras);
        bEnsaladaFruta = (Button)findViewById(R.id.bEnsaladaFruta);
        bGazpacho = (Button)findViewById(R.id.bGazpacho);
        bMigas = (Button)findViewById(R.id.bMigas);
        bEnsaladaPiniones = (Button)findViewById(R.id.bEnsaladaPiniones);
        bSopaCocido = (Button)findViewById(R.id.bSopaCocido);
        bPureVerduras = (Button)findViewById(R.id.bPureVerduras);
        bJudias = (Button)findViewById(R.id.bJudias);
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

        Intent siguiente = new Intent(this, Activity4Ubicacion.class);

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
                cambioPantallaMenus(null);
                return true;
            case R.id.subitemPrimeros:
                Toast.makeText(this,"Ya estas en PRIMEROS", Toast.LENGTH_SHORT).show();
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
    public String pedidoPrimeros= "";
    public void addCarritoSopaVerduras(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("SopaVerduras", pedidoPrimeros +"\nSopaVerduras ..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoEnsaladaFruta(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("EnsaladaFruta", pedidoPrimeros +"\nEnsaladaFruta..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoGazpacho(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Gazpacho", pedidoPrimeros +"\nGazpacho ..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoMigas(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Migas", pedidoPrimeros+"\nMigas ..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoEnsaladaPiniones(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("EnsaladaPiniones", pedidoPrimeros +"\nEnsaladaPiniones ..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoSopaCocido(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("SopaCocido", pedidoPrimeros +"\nSopaCocido ..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoPureVerduras(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("PureVerduras", pedidoPrimeros +"\nPureVerduras ..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
    public void addCarritoJudias(View view){
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Judias", pedidoPrimeros +"\nJudias..................... 8€");
        editorMenu.apply();
        Toast.makeText(this,"Añadido al carrito", Toast.LENGTH_SHORT).show();
    }
}
