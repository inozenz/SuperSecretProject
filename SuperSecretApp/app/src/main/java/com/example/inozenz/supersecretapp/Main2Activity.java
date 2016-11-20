package com.example.inozenz.supersecretapp;

import android.content.Intent;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Lebenslauf ll = (Lebenslauf) getIntent().getSerializableExtra("lebenslauf");
        Log.d("Wir sind auf Seite 2 ", ll.getpDaten().getVorname());
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText strasseedit = (EditText) findViewById(R.id.editText6);
                String strasse = strasseedit.getText().toString();

                EditText hausnummeredit = (EditText) findViewById(R.id.editText7);
                String hausnummer = hausnummeredit.getText().toString();

                EditText plzedit = (EditText) findViewById(R.id.editText8);
                String plz = plzedit.getText().toString();

                EditText stadtedit = (EditText) findViewById(R.id.editText9);
                String stadt = stadtedit.getText().toString();

                Anschrift anschrift = new Anschrift(strasse,hausnummer,plz,stadt);
                ll.getpDaten().setAnschrift(anschrift);

                Log.d("Vorname",hausnummer);
                // Perform action on click
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


            }
        });
    }
}
