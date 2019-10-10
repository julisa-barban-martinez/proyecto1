package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class drama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama);
    }
    public void buton12 (View view){
        Intent buton12 = new Intent( this, Pantalla1.class);
        startActivity(buton12);
    }
    }

