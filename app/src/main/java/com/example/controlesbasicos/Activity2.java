package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity2 extends AppCompatActivity {
    ListView LvDatos;
    Button paises;
    Button planetas;
    Button ayuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        paises= findViewById(R.id.btnPaises);
        planetas= findViewById(R.id.btnPlanetas);
        LvDatos = findViewById(R.id.LvDatos);
        ayuda= findViewById(R.id.btnDatos);
        //tambien sirven estos
        //ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.paises, android.R.layout.simple_spinner_dropdown_item);
        //ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.planeta, android.R.layout.simple_spinner_dropdown_item);

        paises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        pais();
                //LvDatos.setAdapter(adapter);
            }
        });
        planetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    planeta();
               // LvDatos.setAdapter(adapter2);
            }
        });
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayuda();
            }
        });
    }
    private void planeta(){
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.paises, android.R.layout.simple_list_item_1);
        LvDatos.setAdapter(adapter);
    }
    private void pais(){
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.planeta, android.R.layout.simple_list_item_1);
        LvDatos.setAdapter(adapter);
    }
    private void ayuda(){
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.ayuda, android.R.layout.simple_list_item_1);
        LvDatos.setAdapter(adapter);
    }

}