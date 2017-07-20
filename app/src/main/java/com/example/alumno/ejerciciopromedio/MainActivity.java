package com.example.alumno.ejerciciopromedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText asignatura1,asignatura2,asignatura3,nota1,nota2,nota3;
    private CheckBox cb1;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asignatura1 = (EditText) findViewById(R.id.asignatura1);
        asignatura2 = (EditText) findViewById(R.id.asignatura2);
        asignatura3 = (EditText) findViewById(R.id.asignatura3);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        tv1 = (TextView) findViewById(R.id.tv1);

    }

    public void promedio(View view) {

        if (cb1.isChecked()) { /*isChequed() lo utilizamos para indicar que esta seleccionada la opcion u objeto*/
            float nohaAsistido = (Integer.parseInt(nota1.getText().toString()) + Integer.parseInt(nota2.getText().toString()) + Integer.parseInt(nota3.getText().toString())) / 3;
            float resultado = (nohaAsistido * 10) / 100;
            float resultado2 = nohaAsistido - resultado;
            tv1.setText(String.valueOf(resultado2));
        } else {
            float sihaAsistido = (Integer.parseInt(nota1.getText().toString()) + Integer.parseInt(nota2.getText().toString()) + Integer.parseInt(nota3.getText().toString())) / 3;
            tv1.setText(String.valueOf(sihaAsistido));
        }

    }

    }
