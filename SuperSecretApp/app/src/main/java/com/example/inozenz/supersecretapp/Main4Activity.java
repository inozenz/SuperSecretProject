package com.example.inozenz.supersecretapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final Lebenslauf ll = (Lebenslauf) getIntent().getSerializableExtra("lebenslauf");
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText firmaedit = (EditText) findViewById(R.id.editText14);
                String firma = firmaedit.getText().toString();

                EditText positionedit = (EditText) findViewById(R.id.editText15);
                String position = positionedit.getText().toString();

                EditText vonedit = (EditText) findViewById(R.id.editText16);
                String von = vonedit.getText().toString();

                EditText bisedit = (EditText) findViewById(R.id.editText17);
                String bis = bisedit.getText().toString();

                EditText beschreibungedit = (EditText) findViewById(R.id.editText18);
                String beschreibung = beschreibungedit.getText().toString();

                Beruf beruf = new Beruf(von, bis, position, firma, beschreibung);

                ArrayList<Beruf> berufe;
                if(ll.getbLaufbahn() == null) {
                    berufe = new ArrayList<Beruf>();
                    Log.d("bn","erster aufruf");
                }else{
                    berufe = ll.getbLaufbahn().getBerufe();
                    Log.d("bb","zweiter aufruf");
                }

                berufe.add(beruf);
                BeruflicheLaufbahn bLaufbahn = new BeruflicheLaufbahn(berufe);
                ll.setbLaufbahn(bLaufbahn);

                Log.d("Vorname", von);
                // Perform action on click
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


            }
        });

        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText firmaedit = (EditText) findViewById(R.id.editText14);
                String firma = firmaedit.getText().toString();

                EditText positionedit = (EditText) findViewById(R.id.editText15);
                String position = positionedit.getText().toString();

                EditText vonedit = (EditText) findViewById(R.id.editText16);
                String von = vonedit.getText().toString();

                EditText bisedit = (EditText) findViewById(R.id.editText17);
                String bis = bisedit.getText().toString();

                EditText beschreibungedit = (EditText) findViewById(R.id.editText18);
                String beschreibung = beschreibungedit.getText().toString();

                Beruf beruf = new Beruf(von, bis, position, firma, beschreibung);

                ArrayList<Beruf> berufe;
                if(ll.getbLaufbahn() == null) {
                    berufe = new ArrayList<Beruf>();
                    Log.d("bns","erster aufruf");
                }else{
                    berufe = ll.getbLaufbahn().getBerufe();
                    Log.d("bbb","zweiter aufruf");
                }

                berufe.add(beruf);
                BeruflicheLaufbahn bLaufbahn = new BeruflicheLaufbahn(berufe);
                ll.setbLaufbahn(bLaufbahn);


                Intent intent = new Intent(Main4Activity.this, Main4Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

            }




    }

