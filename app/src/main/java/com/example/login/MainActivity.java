package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText um= findViewById(R.id.username);
                EditText up= findViewById(R.id.password);
                TextView alertText= findViewById(R.id.alertText);

                String username = um.getText().toString();
                String password = up.getText().toString();

                if(username.equals("")){
                    alertText.setText("username empty");
                }
                else if(password.equals("")){
                    alertText.setText("password empty");
                }
                else if(username.equals("tafsir") && password.equals("123")) {
                    Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                    startIntent.putExtra("com.example.login.Tafsir", username);
                    startActivity(startIntent);
                }
                else{
                    alertText.setText("username or password wrong");
                }

            }
        });
    }
}