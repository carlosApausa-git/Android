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
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity5Carrito extends AppCompatActivity {
    private TextView tvMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_carrito);
        tvMostrar = (TextView)findViewById(R.id.tvMostrar);
    }

    //----------------------------------------------------------------------------------------------
    //CAMBIO DE ACTIVITY funciones de los botones para cambiar de activity
    //----------------------------------------------------------------------------------------------
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
                Toast.makeText(this,"Ya estas en CARRITO", Toast.LENGTH_SHORT).show();
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
                cambioPantallaBebidas(null);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //COGER DATOS ALMACENADOS EN EL sharedPreferences
    public void onResume(){
        super.onResume();

        //Datos de la Activity MENUS
        String menu1;
        String menu2;
        String menu3;
        String menu4;

        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        //menus
        menu1= datosMenus.getString("Menu1", "");
        menu2= datosMenus.getString("Menu2", "");
        menu3= datosMenus.getString("Menu3", "");
        menu4= datosMenus.getString("Menu4", "");
        tvMostrar.setText(""+menu1);
        tvMostrar.setText(tvMostrar.getText().toString()+menu2);
        tvMostrar.setText(tvMostrar.getText().toString()+menu3);
        tvMostrar.setText(tvMostrar.getText().toString()+menu4);

        //Datos del Activity PRIMEROS
        String SopaVerduras;
        String EnsaladaFruta;
        String Gazpacho;
        String Migas;
        String EnsaladaPiniones;
        String SopaCocido;
        String PureVerduras;
        String Judias;

        SopaVerduras= datosMenus.getString("SopaVerduras", "");
        EnsaladaFruta= datosMenus.getString("EnsaladaFruta", "");
        Gazpacho= datosMenus.getString("Gazpacho", "");
        Migas= datosMenus.getString("Migas", "");
        EnsaladaPiniones= datosMenus.getString("EnsaladaPiniones", "");
        SopaCocido= datosMenus.getString("SopaCocido", "");
        PureVerduras= datosMenus.getString("PureVerduras", "");
        Judias= datosMenus.getString("Judias", "");
        tvMostrar.setText(tvMostrar.getText().toString()+SopaVerduras);
        tvMostrar.setText(tvMostrar.getText().toString()+EnsaladaFruta);
        tvMostrar.setText(tvMostrar.getText().toString()+Gazpacho);
        tvMostrar.setText(tvMostrar.getText().toString()+Migas);
        tvMostrar.setText(tvMostrar.getText().toString()+EnsaladaPiniones);
        tvMostrar.setText(tvMostrar.getText().toString()+SopaCocido);
        tvMostrar.setText(tvMostrar.getText().toString()+PureVerduras);
        tvMostrar.setText(tvMostrar.getText().toString()+Judias);

        //datos Activity SEGUNDOS
        String HuevosFritos;
        String FileteTernera;
        String Salmon;
        String Secreto;
        String Chuleton;
        String PatatasRevolconas;
        String FileteLomo;
        String Macarrones;

        HuevosFritos= datosMenus.getString("HuevosFritos", "");
        FileteTernera= datosMenus.getString("FileteTernera", "");
        Salmon= datosMenus.getString("Salmon", "");
        Secreto= datosMenus.getString("Secreto", "");
        Chuleton= datosMenus.getString("Chuleton", "");
        PatatasRevolconas= datosMenus.getString("PatatasRevolconas", "");
        FileteLomo= datosMenus.getString("FileteLomo", "");
        Macarrones= datosMenus.getString("Macarrones", "");
        tvMostrar.setText(tvMostrar.getText().toString()+HuevosFritos);
        tvMostrar.setText(tvMostrar.getText().toString()+FileteTernera);
        tvMostrar.setText(tvMostrar.getText().toString()+Salmon);
        tvMostrar.setText(tvMostrar.getText().toString()+Secreto);
        tvMostrar.setText(tvMostrar.getText().toString()+Chuleton);
        tvMostrar.setText(tvMostrar.getText().toString()+PatatasRevolconas);
        tvMostrar.setText(tvMostrar.getText().toString()+FileteLomo);
        tvMostrar.setText(tvMostrar.getText().toString()+Macarrones);

        //datos Activity Postres
        String HeladoFresa, Flan, TartaZanahoria, Sandia, MouseLimon;
        HeladoFresa= datosMenus.getString("HeladoFresa", "");
        Flan= datosMenus.getString("FlanQueso", "");
        TartaZanahoria= datosMenus.getString("TartaZanahoria", "");
        Sandia= datosMenus.getString("Sandia", "");
        MouseLimon= datosMenus.getString("MousseLimon", "");
        tvMostrar.setText(tvMostrar.getText().toString()+HeladoFresa);
        tvMostrar.setText(tvMostrar.getText().toString()+Flan);
        tvMostrar.setText(tvMostrar.getText().toString()+TartaZanahoria);
        tvMostrar.setText(tvMostrar.getText().toString()+Sandia);
        tvMostrar.setText(tvMostrar.getText().toString()+MouseLimon);

        //datos Activity BEBIDAS
        String Agua, Cerveza, CocaCola, Aquarius, FantaNaranja, FantaLimon, Nestea, Sprite;
        Agua= datosMenus.getString("Agua", "");
        Cerveza= datosMenus.getString("Cerveza", "");
        CocaCola= datosMenus.getString("CocaCola", "");
        Aquarius= datosMenus.getString("Aquarius", "");
        FantaNaranja= datosMenus.getString("FantaNaranja", "");
        FantaLimon= datosMenus.getString("FantaLimon", "");
        Nestea= datosMenus.getString("Nestea", "");
        Sprite= datosMenus.getString("Sprite", "");
        tvMostrar.setText(tvMostrar.getText().toString()+Agua);
        tvMostrar.setText(tvMostrar.getText().toString()+Cerveza);
        tvMostrar.setText(tvMostrar.getText().toString()+CocaCola);
        tvMostrar.setText(tvMostrar.getText().toString()+Aquarius);
        tvMostrar.setText(tvMostrar.getText().toString()+FantaNaranja);
        tvMostrar.setText(tvMostrar.getText().toString()+FantaLimon);
        tvMostrar.setText(tvMostrar.getText().toString()+Nestea);
        tvMostrar.setText(tvMostrar.getText().toString()+Sprite);
    }
    public void eliminarPedido(View view){
      tvMostrar.setText("Tu carrito esta vacio");
        SharedPreferences datosMenus = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editorMenu = datosMenus.edit();
        editorMenu.putString("Menu1", "");
        editorMenu.putString("Menu2", "");
        editorMenu.putString("Menu3", "");
        editorMenu.putString("Menu4", "");
        editorMenu.putString("SopaVerduras", "");
        editorMenu.putString("EnsaladaFruta", "");
        editorMenu.putString("Gazpacho", "");
        editorMenu.putString("Migas", "");
        editorMenu.putString("EnsaladaPiniones", "");
        editorMenu.putString("SopaCocido", "");
        editorMenu.putString("PureVerduras", "");
        editorMenu.putString("Judias", "");
        editorMenu.putString("HuevosFritos", "");
        editorMenu.putString("FileteTernera", "");
        editorMenu.putString("Salmon", "");
        editorMenu.putString("Secreto", "");
        editorMenu.putString("Chuleton", "");
        editorMenu.putString("PatatasRevolconas", "");
        editorMenu.putString("FileteLomo", "");
        editorMenu.putString("Macarrones", "");
        editorMenu.putString("HeladoFresa", "");
        editorMenu.putString("FlanQueso", "");
        editorMenu.putString("TartaZanahoria", "");
        editorMenu.putString("Sandia", "");
        editorMenu.putString("MousseLimon", "");

        editorMenu.putString("Agua", "");
        editorMenu.putString("Cerveza", "");
        editorMenu.putString("CocaCola", "");
        editorMenu.putString("Aquarius", "");
        editorMenu.putString("FantaNaranja", "");
        editorMenu.putString("FantaLimon", "");
        editorMenu.putString("Nestea", "");
        editorMenu.putString("Sprite", "");
        editorMenu.apply();


    }
    public void realizarPedido(View view) {
        Toast.makeText(this, "PEDIDO REALIZADO", Toast.LENGTH_SHORT).show();
        eliminarPedido(view);
    }
}
