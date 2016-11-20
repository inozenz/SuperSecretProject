package com.example.inozenz.supersecretapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final Lebenslauf ll = (Lebenslauf) getIntent().getSerializableExtra("lebenslauf");
        Log.d("Wir sind auf Seite 2 ", ll.getpDaten().getVorname());
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText pcKenntnisseedit = (EditText) findViewById(R.id.editText21);
                String pcKenntnisse = pcKenntnisseedit.getText().toString();

                Spinner spinner = (Spinner) findViewById(R.id.spinner2);
                String klasse = spinner.getSelectedItem().toString();

                ll.getkFaehigkeiten().setFuehrerschein(klasse);
                ll.getkFaehigkeiten().setPcKenntnisse(pcKenntnisse);


                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(ll);
                Log.d("json",json);
            }
        });
    }
}
