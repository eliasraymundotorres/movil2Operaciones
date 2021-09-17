package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.txtUno);
        n2 = findViewById(R.id.txtDos);

        Button sumar = findViewById(R.id.btnMas);
        Button resta = findViewById(R.id.btnMenos);
        Button producto = findViewById(R.id.btnPor);
        Button division = findViewById(R.id.btnDivision);

        final TextView resultado =  findViewById(R.id.Resultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                resultado.setText("Resultado: "+(num1+num2));
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                resultado.setText("Resultado: "+(num1-num2));
            }
        });
        producto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                resultado.setText("Resultado: "+(num1*num2));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                resultado.setText("Resultado: "+(num1/num2));
            }
        });
    }
}