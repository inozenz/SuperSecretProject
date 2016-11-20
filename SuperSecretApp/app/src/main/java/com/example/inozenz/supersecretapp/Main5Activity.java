package com.example.inozenz.supersecretapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final Lebenslauf ll = (Lebenslauf) getIntent().getSerializableExtra("lebenslauf");
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText spracheedit = (EditText) findViewById(R.id.editText19);
                String sprachestr = spracheedit.getText().toString();

                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                String level = spinner.getSelectedItem().toString();

                Sprache sprache = new Sprache(sprachestr, level);

                ArrayList<Sprache> sprachen;
                if(ll.getkFaehigkeiten() == null) {
                    sprachen = new ArrayList<Sprache>();
                    Log.d("bn","erster aufruf");
                }else{
                    sprachen = ll.getkFaehigkeiten().getFremdSprachen();
                    Log.d("bb","zweiter aufruf");
                }

                sprachen.add(sprache);
                KenntnisseUndFaehigkeiten kFähigkeiten = new KenntnisseUndFaehigkeiten(sprachen,"","");
                ll.setkFaehigkeiten(kFähigkeiten);

                Log.d("Vorname", level);
                // Perform action on click
                Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


            }
        });

        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText spracheedit = (EditText) findViewById(R.id.editText19);
                String sprachestr = spracheedit.getText().toString();


                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                String level = spinner.getSelectedItem().toString();

                Sprache sprache = new Sprache(sprachestr, level);

                ArrayList<Sprache> sprachen;
                if(ll.getkFaehigkeiten() == null) {
                    sprachen = new ArrayList<Sprache>();
                    Log.d("bn","erster aufruf");
                }else{
                    sprachen = ll.getkFaehigkeiten().getFremdSprachen();
                    Log.d("bb","zweiter aufruf");
                }

                sprachen.add(sprache);
                KenntnisseUndFaehigkeiten kFähigkeiten = new KenntnisseUndFaehigkeiten(sprachen,"","");
                ll.setkFaehigkeiten(kFähigkeiten);

                Log.d("Vorname", level);
                // Perform action on click
                Intent intent = new Intent(Main5Activity.this, Main5Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });


    }
}
