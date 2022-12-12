package com.example.loginandcalculatorapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends Activity {

    EditText no1, no2;
    Button add, mul, div, sub, equal;
    TextView answer;
    // variable global
    double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // valores mostrados
        no1 = findViewById(R.id.first_no);
        no2 = findViewById(R.id.second_no);

        // operaciones
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);

        // boton igual
        equal = findViewById(R.id.equals);

        // resultado
        answer = findViewById(R.id.answer);

    // funcionamiento de los botones
    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();
        if (num1.isEmpty() || num2.isEmpty()) {
            Toast.makeText(calculator.this, "Enter Your Numbers Please", Toast.LENGTH_SHORT).show();

        } else {
            double a = Double.parseDouble(no1.getText().toString());
            double b = Double.parseDouble(no2.getText().toString());
            ans = a + b;
           }
        }
    });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
             String num1 = no1.getText().toString();
             String num2 = no2.getText().toString();
        if (num1.isEmpty() || num2.isEmpty()) {
            Toast.makeText(calculator.this, "Enter Your Numbers Please", Toast.LENGTH_SHORT).show();
        } else {
            double a = Double.parseDouble(no1.getText().toString());
            double b = Double.parseDouble(no2.getText().toString());
            ans = a - b;
            }
        }
    });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(calculator.this, "Enter Your Numbers Please", Toast.LENGTH_SHORT).show();
            } else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = a * b;
            }
        }
    });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();
             if (num1.isEmpty() || num2.isEmpty()) {
                 Toast.makeText(calculator.this, "Enter Your Numbers Please", Toast.LENGTH_SHORT).show();
             } else {
                 double a = Double.parseDouble(no1.getText().toString());
                 double b = Double.parseDouble(no2.getText().toString());
                 if (b != 0)
                     ans = a / b;
                 else
                     Toast.makeText(calculator.this, "Enter Valid Numbers Please", Toast.LENGTH_SHORT).show();
             }
            }
        });
    equal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String ans1 = String.valueOf(ans);
            answer.setText(ans1);
            ans = 0;
        }
    });
  }
}