package com.example.enduser.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {

    private EditText Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);




       /* Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Login.class);
                startActivity(startIntent);


            }*/
    }

            public void OnLogin(View view) {
                String userName = Username.getText().toString();
                String passWord = Password.getText().toString();
                String type = "login";
                BackgroundExecution backgroundExecution = new BackgroundExecution(this);
                backgroundExecution.execute(type, userName, passWord);
            }
        }