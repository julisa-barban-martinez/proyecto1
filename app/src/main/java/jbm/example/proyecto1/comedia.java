package jbm.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class comedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedia);
    }
    public void  buton17 (View view){
        Intent buton17 = new Intent( this, Pantalla1.class);
        startActivity(buton17);
    }
}
