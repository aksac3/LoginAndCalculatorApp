package com.example.loginandcalculatorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText user, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // buscar en los recursos
        user = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("AkariSC") && password.getText().toString().equals("1234")) {
                   // actividad actual y a que actividad se dirige
                    startActivity(new Intent(MainActivity.this, calculator.class));
                    // mensaje de notificacion
                    Toast.makeText(MainActivity.this, "Successful Login!", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(MainActivity.this, "Wrong Credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}