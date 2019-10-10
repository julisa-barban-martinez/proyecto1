package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MisPreferidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_preferidas);
    }
    public void  buton19 (View view){
        Intent buton19 = new Intent( this, Pantalla1.class);
        startActivity(buton19);
    }
}
