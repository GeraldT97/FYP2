package com.example.enduser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    EditText UsernameEt, PasswordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        UsernameEt = (EditText) findViewById(R.id.username);
        PasswordEt = (EditText) findViewById(R.id.password);
    }


        public void OnLogin (View view){
            String username = UsernameEt.getText().toString();
            String password = PasswordEt.getText().toString();
            String type = "login";
            BackgroundExecution backgroundWorker = new BackgroundExecution(this);
            backgroundWorker.execute(type, username, password);
        }
         public void OpenReg(View view){
        Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(startIntent);
         }


        }



