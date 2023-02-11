package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.login.Tafsir")){
            TextView name=findViewById(R.id.name);
            String text = getIntent().getExtras().getString("com.example.login.Tafsir");
            name.setText(text);
        }
        Button button = findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), ThirdActivity.class);

                startActivity(startIntent);
            }
        });
    }
}