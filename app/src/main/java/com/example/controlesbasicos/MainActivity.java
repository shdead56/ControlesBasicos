package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    Switch aSwitch;
    Spinner spinner;
    RadioButton m,f;
    FloatingActionButton flot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Escucha de controles
    toggle= findViewById(R.id.toggleButton);
    aSwitch= findViewById(R.id.switch1);
    spinner = findViewById(R.id.spinner);
    //cargando al spineer con datos
    ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.paises, android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    m= findViewById(R.id.radioButton);
    f=findViewById(R.id.radioButton2);
    flot = findViewById(R.id.fabAea);
    toggle.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(toggle.isChecked())
                Toast.makeText(MainActivity.this, "Presiono Prendido", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "Apagado", Toast.LENGTH_LONG).show();
        }
    });
    aSwitch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(aSwitch.isChecked())
                Toast.makeText(MainActivity.this, "Presiono Prendido", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "Apagado", Toast.LENGTH_LONG).show();
        }
    });

    }
}