package com.example.inozenz.supersecretapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Lebenslauf ll = (Lebenslauf) getIntent().getSerializableExtra("lebenslauf");
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText schuleedit = (EditText) findViewById(R.id.editText10);
                String schule = schuleedit.getText().toString();

                EditText abschlussedit = (EditText) findViewById(R.id.editText11);
                String abschluss = abschlussedit.getText().toString();

                EditText vonedit = (EditText) findViewById(R.id.editText12);
                String von = vonedit.getText().toString();

                EditText bisedit = (EditText) findViewById(R.id.editText13);
                String bis = bisedit.getText().toString();

                Ausbildung ausbildung = new Ausbildung(von, bis, schule, abschluss);

                ArrayList<Ausbildung> ausbildungen;
                if(ll.getAusbildung() == null) {
                    ausbildungen = new ArrayList<Ausbildung>();
                    Log.d("bn","erster aufruf");
                }else{
                    ausbildungen = ll.getAusbildung().getAusbildung();
                    Log.d("bb","zweiter aufruf");
                }

                ausbildungen.add(ausbildung);
                SchulischeLaufbahn sLaufbahn = new SchulischeLaufbahn(ausbildungen);
                ll.setAusbildung(sLaufbahn);

                Log.d("Vorname", von);
                // Perform action on click
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


            }
        });

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText schuleedit = (EditText) findViewById(R.id.editText10);
                String schule = schuleedit.getText().toString();

                EditText abschlussedit = (EditText) findViewById(R.id.editText11);
                String abschluss = abschlussedit.getText().toString();

                EditText vonedit = (EditText) findViewById(R.id.editText12);
                String von = vonedit.getText().toString();

                EditText bisedit = (EditText) findViewById(R.id.editText13);
                String bis = bisedit.getText().toString();

                Ausbildung ausbildung = new Ausbildung(von, bis, schule, abschluss);

                ArrayList<Ausbildung> ausbildungen;
                if(ll.getAusbildung() == null) {
                    ausbildungen = new ArrayList<Ausbildung>();
                    Log.d("bn","erster aufruf");
                }else{
                    ausbildungen = ll.getAusbildung().getAusbildung();
                    Log.d("bb","zweiter aufruf");
                }

                ausbildungen.add(ausbildung);
                SchulischeLaufbahn sLaufbahn = new SchulischeLaufbahn(ausbildungen);
                ll.setAusbildung(sLaufbahn);


                Intent intent = new Intent(Main3Activity.this, Main3Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

    }
}
