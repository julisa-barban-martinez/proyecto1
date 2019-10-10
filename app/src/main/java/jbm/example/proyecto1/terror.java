package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class terror extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terror);
    }
    public void  buton16 (View view){
        Intent buton16 = new Intent( this, Pantalla1.class);
        startActivity(buton16);
    }
}
