package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtResult = (TextView) findViewById(R.id.txtAResult);
        txtResult.setText(Double.toString(ActivityOperaciones.op.getRes()));
    }
}