package com.facci.restaurantam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityAM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_am);
    }

    

    public void click1(View v){

        Toast.makeText(MainActivityAM.this,"Bandeja de Mariscos",Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){

        Toast.makeText(MainActivityAM.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();

    }

    public void click3(View v){

        Toast.makeText(MainActivityAM.this,"Ceviche de Camarón",Toast.LENGTH_SHORT).show();

    }

    public void click4(View v){

        Toast.makeText(MainActivityAM.this,"Ceviche",Toast.LENGTH_SHORT).show();

    }

    public void click5(View v){

        Toast.makeText(MainActivityAM.this,"Pescado Frito",Toast.LENGTH_SHORT).show();

    }

    public void click6(View v){

        Toast.makeText(MainActivityAM.this,"Salpietra",Toast.LENGTH_SHORT).show();

    }

    public void click7(View v){

        Toast.makeText(MainActivityAM.this,"Arroz de Mariscos",Toast.LENGTH_SHORT).show();

    }
}
