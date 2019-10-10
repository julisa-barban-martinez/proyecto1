package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
    }
    public void  buton1 (View view){
        Intent buton1 = new Intent( this, nuevo.class);
        startActivity(buton1);
    }
    public void  buton2 (View view){
        Intent buton2 = new Intent( this, MasVistos.class);
        startActivity(buton2);
    }
    public void  buton3 (View view){
        Intent buton3 = new Intent( this, accion.class);
        startActivity(buton3);
    }
    public void  buton4 (View view){
        Intent buton4 = new Intent( this,ParaNinos.class);
        startActivity(buton4);
    }
    public void  buton5 (View view){
        Intent buton5 = new Intent( this, terror.class);
        startActivity(buton5);
    }
    public void  buton6 (View view){
        Intent buton6 = new Intent( this, drama.class);
        startActivity(buton6);
    }
    public void  buton7 (View view){
        Intent buton7 = new Intent( this, comedia.class);
        startActivity(buton7);
    }
    public void  buton8 (View view){
        Intent buton8 = new Intent( this, documentales.class);
        startActivity(buton8);
    }
    public void  buton9 (View view){
        Intent buton9 = new Intent( this, MisPreferidas.class);
        startActivity(buton9);
    }
    public void  buton10 (View view){
        Intent buton10 = new Intent( this, creador.class);
        startActivity(buton10);
    }

}
