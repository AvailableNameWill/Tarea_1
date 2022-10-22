package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tarea_1.clase.Operaciones;

public class ActivityOperaciones extends AppCompatActivity {

    EditText txtn1, txtn2;
    Button btnSuma, btnResta, btnMult, btnDiv;
    Operaciones op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        op = new Operaciones();
        cargarObj();

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones(1);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones(2);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones(3);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones(4);
            }
        });
    }

    private void cargarObj(){
        txtn1 = (EditText) findViewById(R.id.txtNum1);
        txtn2 = (EditText) findViewById(R.id.txtNum2);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
    }

    private void operaciones(int tipoOpe){
        try{
            Double n1 = Double.parseDouble(txtn1.getText().toString());
            Double n2 = Double.parseDouble(txtn2.getText().toString());
            Double res = 0.0;
            if(tipoOpe == 1) res = op.suma(n1,n2);
            else if(tipoOpe == 2) res = op.resta(n1,n2);
            else if(tipoOpe == 3) res = op.multiplicacion(n1,n2);
            else if(tipoOpe == 4) res = op.division(n1,n2);

            Intent intent = new Intent(getApplicationContext(), ActivityResult.class);
            if(res < 0 && tipoOpe == 4){
                Toast.makeText(this, "El denominador no puede ser mayor que el numerador", Toast.LENGTH_SHORT).show();
                return;
            }
            else intent.putExtra("resultado", res);
            startActivity(intent);
        }catch (Exception e) {
            Toast.makeText(this, "Las cajas de texto no deben estar vacias", Toast.LENGTH_SHORT).show();
        }
    }
}