package com.example.inozenz.supersecretapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Lebenslauf ll = new Lebenslauf();
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText vornameedit = (EditText) findViewById(R.id.editText);
                String vorname = vornameedit.getText().toString();

                EditText nachnameedit = (EditText) findViewById(R.id.editText2);
                String nachname = nachnameedit.getText().toString();

                EditText geburtsdatumedit = (EditText) findViewById(R.id.editText3);
                String geburtsdatum = geburtsdatumedit.getText().toString();


                EditText telefonedit = (EditText) findViewById(R.id.editText4);
                String telefon = telefonedit.getText().toString();

                EditText emailedit = (EditText) findViewById(R.id.editText5);
                String email = emailedit.getText().toString();

                PersoenlicheDaten pDaten = new PersoenlicheDaten(vorname,nachname,null,telefon,email,geburtsdatum);
                ll.setpDaten(pDaten);
                Log.d("Vorname",vorname);
                Log.d("Nachname",nachname);
                Log.d("gb",geburtsdatum);
                Log.d("tele",telefon);
                Log.d("mail",email);
                // Perform action on click
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("lebenslauf",ll);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });


    }
}
