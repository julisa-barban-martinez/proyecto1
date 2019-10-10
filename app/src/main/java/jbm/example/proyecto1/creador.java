package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class creador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creador);
    }
    public void buton20 (View view){
        Intent buton20 = new Intent( this, Pantalla1.class);
        startActivity(buton20);
    }
}
