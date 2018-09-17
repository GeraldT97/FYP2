package com.example.enduser.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Username, Password, Email, ContactNO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username =(EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Email = (EditText)findViewById(R.id.email);
        ContactNO = (EditText)findViewById(R.id.contactNO);



    }

    public void OnReg(View view){
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        String email = Email.getText().toString();
        String contactNO = ContactNO.getText().toString();
        String type = "register";
        BackgroundExecution backgroundWorker = new BackgroundExecution(this);
        backgroundWorker.execute(type, username, password, email, contactNO);


    }





}


