package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MasVistos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_vistos);
    }
    public void buton13 (View view){
        Intent buton13 = new Intent( this, Pantalla1.class);
        startActivity(buton13);
    }
}
