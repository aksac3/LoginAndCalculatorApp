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

        /*
        // Database
        myDB = new DB (context: this)
        btnSingUp.setOnClickListener(new View.onClickListener() {
        @Overrride
        public void onClick(View v) {
        String user = Username.getText().toString();
        String password = Password.getText().toString();

        if (user.equals("") || password.equals("")) {
        Toast.makeText(this, "Add your credentials", Toast.LENGTH_SHORT).show();
        } else {
        if (user.equals (Username)) {
        Boolean usercheckResult = myDB.checkusername(user);
        if (usercheckResult == false)
        {
        Boolean regResult = myDB.insertData(user.password);
        if (regResult == true) {
        Toast.makeText(this, "Registration Successful.", Toast.LENGTH_SHORT).show();
        }
       else {
       Toast.makeText(this, "Registration Failed.", Toast.LENGTH_SHORT).show();
       }
     }
        else {
         Toast.makeText(this, "User already exist. \n Please Sign In", Toast.LENGTH_SHORT).show();
         }
     }
         else {
         Toast.makeText(this, "Wrong credentials", Toast.LENGTH_SHORT).show();
       }
     }
    });
    */

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
