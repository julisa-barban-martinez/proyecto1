package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ParaNinos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_ninos);
    }
    public void  buton15 (View view){
        Intent buton15 = new Intent( this, Pantalla1.class);
        startActivity(buton15);
    }
}
